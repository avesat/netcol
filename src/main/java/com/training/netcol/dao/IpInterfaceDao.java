package com.training.netcol.dao;

import com.training.netcol.model.IpInterface;

import java.util.List;
import java.util.Optional;

public interface IpInterfaceDao {

    public IpInterface save(IpInterface intf);

    public <S extends IpInterface> List<S> saveAll(Iterable<S> intf);

    public Optional<IpInterface> findById(Long id);

    public boolean existsById(Long id);

    public Iterable<IpInterface> findAll();

    public Iterable<IpInterface> findAllById(Iterable<Long> ids);

    public long count();

    public void deleteById(Long id);

    public void delete(IpInterface intf);

    public void deleteAll(Iterable<? extends IpInterface> intfs);

    public void deleteAll();
}
