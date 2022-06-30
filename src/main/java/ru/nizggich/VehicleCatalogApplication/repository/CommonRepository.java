package ru.nizggich.VehicleCatalogApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import ru.nizggich.VehicleCatalogApplication.domain.AbstractEntity;


@NoRepositoryBean
public interface CommonRepository<E extends AbstractEntity> extends JpaRepository<E, Long> {
}
