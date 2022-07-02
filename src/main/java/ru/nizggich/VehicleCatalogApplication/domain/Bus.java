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
public class Bus extends Vehicle{
  private int numberOfPassengers;
}
