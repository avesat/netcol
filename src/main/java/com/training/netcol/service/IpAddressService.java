package com.training.netcol.service;

import com.training.netcol.dao.inmemory.InMemoryIpAddressDao;
import com.training.netcol.model.IpAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IpAddressService {
    @Autowired
    private InMemoryIpAddressDao ipAddressDao;

    public void save(IpAddress ipAddress) {
        try {
            ipAddressDao.save(ipAddress);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
