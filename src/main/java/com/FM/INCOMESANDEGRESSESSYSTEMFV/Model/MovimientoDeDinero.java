package com.FM.INCOMESANDEGRESSESSYSTEMFV.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Data
@Entity
@Table(name = "movimientoDeDinero")
public class MovimientoDeDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovimientoDeDinero;
    private Double monto;

    @Column(nullable = false)
    private String conceptoMovimientoDinero;
    // private Empleado empleado;
}



