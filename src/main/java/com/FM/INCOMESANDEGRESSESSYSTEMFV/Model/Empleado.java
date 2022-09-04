
package com.FM.INCOMESANDEGRESSESSYSTEMFV.Model;


import lombok.Data;

import javax.persistence.*;


enum Rol_Enum { ADMINISTRADOR,OPERATIVO
}


@Data
@Table(name = "Empleados")
@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpleado;
    @Column
    private String nombreEmpleado, correo;
    @OneToOne
    @JoinColumn
    private Empresa empresa;
    @Column
    private Rol_Enum rol;

}
