package com.training.netcol.service;

import com.training.netcol.dao.inmemory.InMemoryHostDao;
import com.training.netcol.model.*;
import com.training.netcol.task.HostTask;
import com.training.netcol.task.TaskExecutor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

@Service
public class HostServiceBean implements HostService {
    @Autowired
    @Getter
    private TaskExecutor taskExecutor;
    @Autowired
    private InMemoryHostDao hostDao;
    @Autowired
    private IpInterfaceService ipInterfaceService;
    @Autowired
    private IpRouteService ipRouteService;

    private final String COLLECT_HOST_DATA_URL = "http://localhost:8086/host";
    private HttpHeaders headers;

    HostServiceBean() {
        headers = new HttpHeaders();
        headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
        headers.setContentType(MediaType.APPLICATION_JSON);
    }

    @Override
    public HostResponse startCollectHostData(HostRequest hostRequest) {
        HostTask hostTask = new HostTask(hostRequest, this);
        taskExecutor.executeTask(hostTask);

        HostResponse resp = new HostResponse();
        resp.setId(hostTask.getId());
        resp.setStatus(hostTask.getStatus());

        return resp;
    }

    @Override
    public Host getHostById(Long hostId) {
        return hostDao.findByRequestId(hostId).get();
    }

    @Override
    public void save(Host host) {
        try {
            for (IpInterface intf: host.getIpInterfaces()) {
                ipInterfaceService.save(intf);
            }
            for (IpRoute route: host.getIpRoutes()) {
                ipRouteService.save(route);
            }
            hostDao.save(host);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}

