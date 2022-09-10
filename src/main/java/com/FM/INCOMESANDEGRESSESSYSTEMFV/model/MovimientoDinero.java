package com.FM.INCOMESANDEGRESSESSYSTEMFV.model;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data

@Entity
@Table(name = "Movimientos_de_Dinero")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMovimientoDeDinero;

    @Column (name = "Monto",nullable = false)
    private Double monto;

    @Column(name = "concepto_transaccion")
    private String conceptoMovimientoDinero;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name =  "id_empleado")
    private Empleado empleado;


    @Column(name= "fecha_creacion")
    private LocalDate createAt;

    @Column(name= "fecha_actualizacion")
    private LocalDate updateAt;

}



