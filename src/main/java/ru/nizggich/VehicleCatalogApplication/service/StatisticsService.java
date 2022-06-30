package ru.nizggich.VehicleCatalogApplication.service;


import ru.nizggich.VehicleCatalogApplication.domain.AbstractEntity;
import ru.nizggich.VehicleCatalogApplication.pojo.VehicleStatistic;

public interface StatisticsService {
    <E extends AbstractEntity> VehicleStatistic getStatistic(Class<E> eClass);
}
