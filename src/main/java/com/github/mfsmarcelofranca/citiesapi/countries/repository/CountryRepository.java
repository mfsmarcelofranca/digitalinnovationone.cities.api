package com.github.mfsmarcelofranca.citiesapi.countries.repository;

import com.github.mfsmarcelofranca.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
