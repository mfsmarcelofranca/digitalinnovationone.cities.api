package com.github.mfsmarcelofranca.citiesapi.cities.entities.repositories;

import com.github.mfsmarcelofranca.citiesapi.cities.entities.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
