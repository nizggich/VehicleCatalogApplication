package ru.nizggich.VehicleCatalogApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nizggich.VehicleCatalogApplication.domain.Vehicle;
import ru.nizggich.VehicleCatalogApplication.pojo.VehicleStatistic;
import ru.nizggich.VehicleCatalogApplication.service.StatisticsService;
import ru.nizggich.VehicleCatalogApplication.service.VehicleService;


@RestController
@RequestMapping("/vehicle")
public class VehicleController extends AbstractController<Vehicle, VehicleService>{

    protected VehicleController(VehicleService service, StatisticsService statisticsService) {
        super(service, statisticsService);
    }

    @Override
    public VehicleStatistic getStatistic() {
        return getStatisticsService().getStatistic(Vehicle.class);
    }
}
