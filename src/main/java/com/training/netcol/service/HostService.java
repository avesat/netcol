package com.training.netcol.service;

import com.training.netcol.model.Host;
import com.training.netcol.model.HostRequest;
import com.training.netcol.model.HostResponse;

public interface HostService {
    HostResponse startCollectHostData(HostRequest hostRequest);
    Host getHostById(Long hostId);
    void save(Host host);
}
