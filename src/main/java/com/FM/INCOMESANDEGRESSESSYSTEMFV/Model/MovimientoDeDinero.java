package com.FM.INCOMESANDEGRESSESSYSTEMFV.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "MovientosdeDinero")
public class MovimientoDeDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMovimientoDeDinero;

    @Column (name = "Monto",nullable = false)
    private Double monto;

    @Column(nullable = false)
    private String conceptoMovimientoDinero;

    @ManyToOne
    @JoinColumn(name =  "rol_empleado",nullable = false)
    private Empleado empleado;


}



