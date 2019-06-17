package com.training.netcol.dao;

import com.training.netcol.model.IpRoute;

import java.util.List;
import java.util.Optional;

public interface IpRouteDao {
    public IpRoute save(IpRoute route);

    public <S extends IpRoute> List<S> saveAll(Iterable<S> route);

    public Optional<IpRoute> findById(Long id);

    public boolean existsById(Long id);

    public Iterable<IpRoute> findAll();

    public Iterable<IpRoute> findAllById(Iterable<Long> ids);

    public long count();

    public void deleteById(Long id);

    public void delete(IpRoute route);

    public void deleteAll(Iterable<? extends IpRoute> routes);

    public void deleteAll();
}
