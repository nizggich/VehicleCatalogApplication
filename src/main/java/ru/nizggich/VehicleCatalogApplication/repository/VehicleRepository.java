package ru.nizggich.VehicleCatalogApplication.repository;
import org.springframework.stereotype.Repository;
import ru.nizggich.VehicleCatalogApplication.domain.Vehicle;

@Repository
public interface VehicleRepository extends CommonRepository<Vehicle>{
}
