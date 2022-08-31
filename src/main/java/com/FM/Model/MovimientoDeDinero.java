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


public MovimientoDeDinero(Double monto, String conceptoMovimientoDinero, String rolEmpleado){
    this.monto = monto;
    this.conceptoMovimientoDinero = conceptoMovimientoDinero;
    this.rolEmpleado = rolEmpleado;
}

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getConceptoMovimientoDinero() {
        return conceptoMovimientoDinero;
    }

    public void setConceptoMovimientoDinero(String conceptoMovimientoDinero) {
        this.conceptoMovimientoDinero = conceptoMovimientoDinero;
    }
}
