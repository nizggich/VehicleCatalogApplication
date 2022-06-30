package ru.nizggich.VehicleCatalogApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nizggich.VehicleCatalogApplication.domain.Bus;
import ru.nizggich.VehicleCatalogApplication.pojo.VehicleStatistic;
import ru.nizggich.VehicleCatalogApplication.service.BusService;
import ru.nizggich.VehicleCatalogApplication.service.StatisticsService;


@RestController
@RequestMapping("/buses")
public class BusController extends AbstractController<Bus, BusService>{

    protected BusController(BusService service, StatisticsService statisticsService) {
        super(service, statisticsService);
    }

    @Override
    public VehicleStatistic getStatistic() {
        return getStatisticsService().getStatistic(Bus.class);
    }
}
