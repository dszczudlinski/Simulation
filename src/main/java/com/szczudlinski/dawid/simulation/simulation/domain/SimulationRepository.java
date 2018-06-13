package com.szczudlinski.dawid.simulation.simulation.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimulationRepository extends JpaRepository<Simulation, Long> {
    // Page<Simulation> findAll(Pageable pageable);
}
