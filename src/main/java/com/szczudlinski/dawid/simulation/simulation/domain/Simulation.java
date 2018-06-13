package com.szczudlinski.dawid.simulation.simulation.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@Table(name = "simulation")
public class Simulation {

    @Id
    @GeneratedValue
    private BigDecimal id;

    private Date startDate;

    private BigDecimal duration;

    private String frequency;

    private String firstName;

    private String lastName;

    private Date birthDate;

    private String phoneNumber;

    private String email;
}
