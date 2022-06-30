package ru.nizggich.VehicleCatalogApplication.service;


import ru.nizggich.VehicleCatalogApplication.domain.AbstractEntity;
import ru.nizggich.VehicleCatalogApplication.exception.ClientRuntimeException;
import ru.nizggich.VehicleCatalogApplication.repository.CommonRepository;
import ru.nizggich.VehicleCatalogApplication.validation.Error;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService<E extends AbstractEntity> implements CommonService<E> {

    private CommonRepository<E> repository;

    protected AbstractService(CommonRepository<E> repository) {
        this.repository = repository;
    }

    @Override
    public E save(E entity) {
        if (entity == null) {
            throw new ClientRuntimeException(Error.SAVING_ENTITY_IS_NULL);
        }
        return repository.save(entity);
    }

    @Override
    public List<E> save(List<E> entities) {
        return repository.saveAll(entities);
    }

    @Override
    public Optional<E> findById(Long id) {
        if (id == null) {
           throw new ClientRuntimeException(Error.ENTITY_ID_IS_NULL);
        }
        return repository.findById(id);
    }

    @Override
    public List<E> findAll() {
        return repository.findAll();
    }


    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void delete(E entity) {
        repository.delete(entity);
    }

}
