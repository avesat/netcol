package com.training.netcol.dao;

import com.training.netcol.model.IpAddress;

import java.util.List;
import java.util.Optional;

public interface IpAddressDao {
    public IpAddress save(IpAddress addr);

    public <S extends IpAddress> List<S> saveAll(Iterable<S> addr);

    public Optional<IpAddress> findById(Long id);

    public boolean existsById(Long id);

    public Iterable<IpAddress> findAll();

    public Iterable<IpAddress> findAllById(Iterable<Long> ids);

    public long count();

    public void deleteById(Long id);

    public void delete(IpAddress addr);

    public void deleteAll(Iterable<? extends IpAddress> addrs);

    public void deleteAll();
}
