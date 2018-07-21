package com.szczudlinski.dawid.simulation.simulation.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SimulationRepository extends JpaRepository<Simulation, Long> {
    Optional<Simulation> getBySimulationNumber(String number);
}
