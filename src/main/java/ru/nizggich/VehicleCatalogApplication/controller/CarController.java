package ru.nizggich.VehicleCatalogApplication.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nizggich.VehicleCatalogApplication.domain.Car;
import ru.nizggich.VehicleCatalogApplication.pojo.VehicleStatistic;
import ru.nizggich.VehicleCatalogApplication.service.CarService;
import ru.nizggich.VehicleCatalogApplication.service.StatisticsService;


@RestController
@RequestMapping("/cars")
public class CarController extends AbstractController<Car, CarService>{

    public CarController(CarService service, StatisticsService statisticsService) {
        super(service, statisticsService);
    }


    @Override
    public VehicleStatistic getStatistic() {
        return getStatisticsService().getStatistic(Car.class);
    }


}
