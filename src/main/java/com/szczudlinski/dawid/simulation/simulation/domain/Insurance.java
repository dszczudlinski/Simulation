package com.szczudlinski.dawid.simulation.simulation.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "insurance")
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    private String code;

    private BigDecimal sum;

    private String baseProduct;
}
