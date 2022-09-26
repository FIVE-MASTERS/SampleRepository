package com.FM.INCOMESANDEGRESSESSYSTEMFV.model;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Movimientos_de_Dinero")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovimientoDinero;

    @Column (name = "Monto",nullable = false)
    private Double monto;

    @Column(name = "concepto_transaccion")
    private String conceptoMovimientoDinero;

    @ManyToOne
    @JoinColumn(name =  "id_empleado")
    private Empleado empleado;


    @Column(name= "fecha_creacion")
    private LocalDate createAt;

    @Column(name= "fecha_actualizacion")
    private LocalDate updateAt;

}



