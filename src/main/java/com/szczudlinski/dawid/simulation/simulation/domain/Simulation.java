package com.szczudlinski.dawid.simulation.simulation.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "simulation")
public class Simulation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    private BigDecimal simulationNumber;

    private Date startDate;

    private BigDecimal duration;

    private String frequency;

    private String firstName;

    private String lastName;

    private Date birthDate;

    private String phoneNumber;

    private String email;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "simId")
    private List<Insurance> insuranceList;
}