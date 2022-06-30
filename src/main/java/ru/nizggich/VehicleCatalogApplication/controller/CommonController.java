package ru.nizggich.VehicleCatalogApplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nizggich.VehicleCatalogApplication.domain.AbstractEntity;
import ru.nizggich.VehicleCatalogApplication.pojo.VehicleStatistic;


import java.util.List;

public interface CommonController<E extends AbstractEntity> {
    @GetMapping()
    ResponseEntity<List<E>> getAll();

    @PostMapping
    ResponseEntity<E> save(@RequestBody E entity);

    @GetMapping("/{id}")
    ResponseEntity<E> getById(@PathVariable Long id);

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id);

    @DeleteMapping
    void delete(@RequestBody E entity);

    @GetMapping("/statistics")
    VehicleStatistic getStatistic();

}
