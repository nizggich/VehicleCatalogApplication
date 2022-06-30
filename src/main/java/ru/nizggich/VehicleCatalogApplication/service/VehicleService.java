package ru.nizggich.VehicleCatalogApplication.service;

import org.springframework.stereotype.Service;
import ru.nizggich.VehicleCatalogApplication.domain.Vehicle;
import ru.nizggich.VehicleCatalogApplication.repository.VehicleRepository;

@Service
public class VehicleService extends AbstractService<Vehicle>{

    protected VehicleService(VehicleRepository vehicleRepository) {
        super(vehicleRepository);
    }
}
