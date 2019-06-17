package com.training.netcol.dao;

import com.training.netcol.model.Host;

import java.util.Optional;

public interface HostDao {

    public Host save(Host host);

    public <S extends Host> Iterable<S> saveAll(Iterable<S> newHosts);

    public Optional<Host> findById(Long id);

    public Optional<Host> findByRequestId(Long reqId);

    public boolean existsById(Long id);

    public Iterable<Host> findAll();

    public Iterable<Host> findAllById(Iterable<Long> ids);

    public long count();

    public void deleteById(Long id);

    public void delete(Host host);

    public void deleteAll(Iterable<? extends Host> iterHosts);

    public void deleteAll();
}
