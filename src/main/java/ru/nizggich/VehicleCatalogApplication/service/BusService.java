package ru.nizggich.VehicleCatalogApplication.service;

import org.springframework.stereotype.Service;
import ru.nizggich.VehicleCatalogApplication.domain.Bus;
import ru.nizggich.VehicleCatalogApplication.repository.BusRepository;


@Service
public class BusService extends AbstractService<Bus>{

    protected BusService(BusRepository repository) {
        super(repository);
    }
}
