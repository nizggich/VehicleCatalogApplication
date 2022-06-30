package ru.nizggich.VehicleCatalogApplication.repository;

import org.springframework.stereotype.Repository;
import ru.nizggich.VehicleCatalogApplication.domain.Car;


@Repository
public interface CarRepository extends CommonRepository<Car> {
}
