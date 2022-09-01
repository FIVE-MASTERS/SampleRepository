package com.FM.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class MovimientoDeDinero {
    private Double monto;
    private String conceptoMovimientoDinero;
    private Empleado empleado;

}



