package com.FM.INCOMESANDEGRESSESSYSTEMFV.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


=======
import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
>>>>>>> ddd794d34acddf98bdb34091bb95197cd221f4ce
@Data
@Entity
<<<<<<< HEAD
@Table(name = "movimientoDeDinero")
=======
@Table(name = "MovientosdeDinero")
>>>>>>> ddd794d34acddf98bdb34091bb95197cd221f4ce
public class MovimientoDeDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    private Long idMovimientoDeDinero;
=======
    private long idMovimientoDeDinero;

    @Column (name = "Monto",nullable = false)
>>>>>>> ddd794d34acddf98bdb34091bb95197cd221f4ce
    private Double monto;

    @Column(nullable = false)
    private String conceptoMovimientoDinero;
<<<<<<< HEAD
    // private Empleado empleado;
=======

    @ManyToOne
    @JoinColumn(name =  "rol_empleado",nullable = false)
    private Empleado empleado;


>>>>>>> ddd794d34acddf98bdb34091bb95197cd221f4ce
}



