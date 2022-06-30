package ru.nizggich.VehicleCatalogApplication.service;

import ru.nizggich.VehicleCatalogApplication.domain.AbstractEntity;

import java.util.List;
import java.util.Optional;

public interface CommonService<E extends AbstractEntity> {
    E save(E entity);
    List<E> save(List<E> entities);
    Optional<E> findById(Long id);
    List<E> findAll();
    void delete(Long id);
    void delete(E entity);
}
