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
    @Column (name = "Monto")
    private Double monto;
    @Column
    private String conceptoMovimientoDinero;
    @ManyToOne
    @JoinColumn(name = "Rol")
    private Empleado empleado;


}



