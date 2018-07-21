package com.szczudlinski.dawid.simulation.simulation.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class InsuranceDTO {
    private String code;

    private BigDecimal sum;

    private String baseProduct;
}
