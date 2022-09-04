package com.FM.INCOMESANDEGRESSESSYSTEMFV.Model;


import lombok.Data;

import javax.persistence.*;


@Data

@Entity
@Table(name = "Movientos de Dinero")
public class MovimientoDeDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMovimientoDeDinero;
    @Column
    private Double monto;
    @Column
    private String conceptoMovimientoDinero;
    @ManyToOne
    @JoinColumn(name = "empleado_id_empleado")
    private Empleado empleado;


}



