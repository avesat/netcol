package com.training.netcol.service;

import com.training.netcol.dao.inmemory.InMemoryIpRouteDao;
import com.training.netcol.model.IpRoute;
import com.training.netcol.model.RouteCmd;
import com.training.netcol.model.RouteCmdResponse;
import com.training.netcol.task.IpRouteCmdTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class IpRouteService {
    @Autowired
    private /*IpRouteDao*/InMemoryIpRouteDao ipRouteDao;

    public void save(IpRoute ipRoute) {
        try {
            ipRouteDao.save(ipRoute);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<IpRoute> getAll() {
        return StreamSupport.stream(ipRouteDao.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    /*
    public RouteCmdResponse addRemoteHostRoute(RouteCmd routeCmd) {
        IpRouteCmdTask ipRouteCmdTask = new IpRouteCmdTask(routeCmd, this);
        ipRouteCmdTask.run();

        RouteCmdResponse resp = new RouteCmdResponse();
        resp.setStatus(ipRouteCmdTask.getStatus());

        return resp;
    }
     */
}
