package ru.nizggich.VehicleCatalogApplication.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

@MappedSuperclass
@NoArgsConstructor
@Data
public class AbstractEntity {
    @Id
    @SequenceGenerator(name = "pk_seq", sequenceName = "base_seq", allocationSize = 1)
    @GeneratedValue(generator = "pk_seq")
    Long id;

    private String model;

    private int modelYear;

    private String registerSign;

    private String color;

}
