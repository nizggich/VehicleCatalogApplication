package ru.nizggich.VehicleCatalogApplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;


@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Car extends Vehicle{
   private int engineVolume;
}
