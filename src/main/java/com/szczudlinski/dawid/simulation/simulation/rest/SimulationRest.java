package com.szczudlinski.dawid.simulation.simulation.rest;

import com.szczudlinski.dawid.simulation.simulation.domain.Simulation;
import com.szczudlinski.dawid.simulation.simulation.domain.SimulationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/simulation", produces = MediaType.APPLICATION_JSON_VALUE)
public class SimulationRest {

    private SimulationRepository simulationRepository;

    @Autowired
    public SimulationRest(SimulationRepository simulationRepository) {
        this.simulationRepository = simulationRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Page<Simulation> getSimulations(Pageable pageRequest) {
        return simulationRepository.findAll(pageRequest);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String addSimulation(@RequestBody Simulation simulation){
        simulationRepository.save(simulation);
        return "OK";
    }
}
