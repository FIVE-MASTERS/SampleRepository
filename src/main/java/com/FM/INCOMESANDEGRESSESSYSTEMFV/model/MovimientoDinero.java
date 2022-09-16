package com.FM.INCOMESANDEGRESSESSYSTEMFV.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Movimientos_de_Dinero")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovimientoDeDinero;

    @Column (name = "Monto",nullable = false)
    private Double monto;

    @Column(name = "concepto_transaccion")
    private String conceptoMovimientoDinero;

    @ManyToOne //(cascade = CascadeType.ALL)
    @JoinColumn(name =  "id_empleado")
    private Empleado empleado;


    @Column(name= "fecha_creacion")
    private LocalDate createAt;

    @Column(name= "fecha_actualizacion")
    private LocalDate updateAt;

}



