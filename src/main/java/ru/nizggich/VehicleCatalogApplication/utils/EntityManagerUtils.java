package ru.nizggich.VehicleCatalogApplication.utils;

import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


@Component
public class EntityManagerUtils {
    private static EntityManager entityManager = null;

    public static EntityManager getEntityManager() {
        if (entityManager == null) {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE");
            entityManager = entityManagerFactory.createEntityManager();
        }
        return entityManager;
    }
}
