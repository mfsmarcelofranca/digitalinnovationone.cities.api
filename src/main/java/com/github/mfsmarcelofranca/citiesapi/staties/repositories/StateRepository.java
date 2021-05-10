package com.github.mfsmarcelofranca.citiesapi.staties.repositories;

import com.github.mfsmarcelofranca.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
