package ru.nizggich.VehicleCatalogApplication.service.Impl;

import org.springframework.stereotype.Service;
import ru.nizggich.VehicleCatalogApplication.domain.AbstractEntity;
import ru.nizggich.VehicleCatalogApplication.pojo.VehicleStatistic;
import ru.nizggich.VehicleCatalogApplication.service.StatisticsService;
import ru.nizggich.VehicleCatalogApplication.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.Date;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    @Override
    public <E extends AbstractEntity> VehicleStatistic getStatistic(Class<E> eClass) {
        EntityManager entityManager = EntityManagerUtils.getEntityManager();
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();

        CriteriaQuery<Long> query = cb.createQuery(Long.class);
        query.select(cb.count(query.from(eClass)));

        Long numberOfEntries = entityManager.createQuery(query).getSingleResult();

        return new VehicleStatistic(numberOfEntries);
    }

}
