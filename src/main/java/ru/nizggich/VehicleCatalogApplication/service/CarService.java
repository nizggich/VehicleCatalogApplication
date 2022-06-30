package ru.nizggich.VehicleCatalogApplication.service;

import org.springframework.stereotype.Service;
import ru.nizggich.VehicleCatalogApplication.domain.Car;
import ru.nizggich.VehicleCatalogApplication.repository.CarRepository;


@Service
public class CarService extends AbstractService<Car> {

    protected CarService(CarRepository repository) {
        super(repository);
    }
}
