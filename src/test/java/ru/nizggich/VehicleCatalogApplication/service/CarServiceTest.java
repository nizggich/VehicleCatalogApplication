package ru.nizggich.VehicleCatalogApplication.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.nizggich.VehicleCatalogApplication.domain.Car;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
class CarServiceTest {

    @Autowired
    private CarService carService;

    @Test
    void save() {
        Car car = new Car();
        car.setColor("green");

        Car savedCar = carService.save(car);

        assertEquals(car, savedCar);
    }

    @Test
    void saveAll(){
        Car car1 = new Car();
        car1.setColor("pink");

        Car car2 = new Car();
        car2.setColor("red");

        List<Car> carsToSave = List.of(car1, car2);

        List<Car> savedCars = carService.save(carsToSave);

        assertEquals(carsToSave, savedCars);
    }

    @Test
    void findById() {
        Car car = new Car();

        Car saveCar = carService.save(car);
        Optional<Car> foundCar = carService.findById(saveCar.getId());

        assertTrue(foundCar.isPresent());
        assertEquals(foundCar.get(), car);
    }

    @Test
    void findAll() {
        Car car1 = new Car();
        car1.setModel("Nissan");

        Car car2 = new Car();
        car2.setModel("Toyota");

        List<Car> carToSave = List.of(car1, car2);
        List<Car> savedCars = carService.save(carToSave);

        List<Car> foundCars = carService.findAll();

        assertTrue(foundCars.containsAll(savedCars));

    }

}