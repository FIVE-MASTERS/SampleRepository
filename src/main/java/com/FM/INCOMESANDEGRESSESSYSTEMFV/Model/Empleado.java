
package com.FM.INCOMESANDEGRESSESSYSTEMFV.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


enum Rol_Enum { ADMINISTRADOR,OPERATIVO
}
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Empleados")
@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpleado;

    @Column(name = "nombre",nullable = false)
    private String nombreEmpleado;

    @Column(nullable = false)
    private String correo;

    @ManyToOne
    @JoinColumn(name = "nombre_empresa",nullable = false )
    private Empresa empresa;

    @Column(nullable = false)
    private Rol_Enum rol;



}
