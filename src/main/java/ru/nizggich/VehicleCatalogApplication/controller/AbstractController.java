package ru.nizggich.VehicleCatalogApplication.controller;

import lombok.Data;
import org.springframework.http.ResponseEntity;
import ru.nizggich.VehicleCatalogApplication.domain.AbstractEntity;
import ru.nizggich.VehicleCatalogApplication.pojo.VehicleStatistic;
import ru.nizggich.VehicleCatalogApplication.service.AbstractService;
import ru.nizggich.VehicleCatalogApplication.service.StatisticsService;


import java.util.List;

@Data
public abstract class AbstractController <E extends AbstractEntity, S extends AbstractService<E>> implements CommonController<E> {

    private S service;
    private StatisticsService statisticsService;

    protected AbstractController(S service, StatisticsService statisticsService) {
        this.service = service;
        this.statisticsService = statisticsService;
    }


    @Override
    public ResponseEntity<E> save(E entity) {

        return ResponseEntity.ok(service.save(entity));
    }

    @Override
    public ResponseEntity<List<E>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @Override
    public ResponseEntity<E> getById(Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.badRequest().body(null));
    }

    @Override
    public void delete(Long id) {
        service.delete(id);
    }

    @Override
    public void delete(E entity) {
        service.delete(entity);
    }


    @Override
    public abstract VehicleStatistic getStatistic();
}