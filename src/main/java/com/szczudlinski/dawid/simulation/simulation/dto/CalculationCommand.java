package com.szczudlinski.dawid.simulation.simulation.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class CalculationCommand {

    private BigDecimal duration;

    private String frequency;

    private Date birthDate;
    
    private List<InsuranceDTO> insuranceList;
}
