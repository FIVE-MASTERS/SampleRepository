
package com.FM.INCOMESANDEGRESSESSYSTEMFV.Model;


import lombok.Data;


import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;




enum Rol_Enum { ADMINISTRADOR,OPERATIVO
}


@Data
@Table(name = "Empleado")
@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpleado;
    @Column
    private String nombreEmpleado, correo;
    @Column
    private Empresa empresa;
    @Column
    private Rol_Enum rol;

}
