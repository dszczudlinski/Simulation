package com.szczudlinski.dawid.simulation.simulation.rest;

import com.szczudlinski.dawid.simulation.simulation.domain.Simulation;
import com.szczudlinski.dawid.simulation.simulation.domain.SimulationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


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

    @RequestMapping(value = "/{simulationNumber}", method = RequestMethod.GET)
    @ResponseBody
    public Simulation getSimulation(@PathVariable String simulationNumber) {
        Optional<Simulation> simulation = simulationRepository.getBySimulationNumber(simulationNumber);
        return simulation.get();
    }

    @RequestMapping(value = "/makeOffer/{simulationNumber}", method = RequestMethod.GET)
    @ResponseBody
    public String makeOffer(@PathVariable String simulationNumber) {
        Optional<Simulation> simulation = simulationRepository.getBySimulationNumber(simulationNumber);
        return "OK";
    }
}
