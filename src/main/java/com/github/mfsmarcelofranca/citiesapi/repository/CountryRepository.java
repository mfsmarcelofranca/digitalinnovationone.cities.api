package com.github.mfsmarcelofranca.citiesapi.repository;

import com.github.mfsmarcelofranca.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
