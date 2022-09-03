package com.FM.INCOMESANDEGRESSESSYSTEMFV.Model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data

@Entity
public class MovimientoDeDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMovimientoDeDinero;
    private Double monto;
    private String conceptoMovimientoDinero;
    private Empleado empleado;


}



