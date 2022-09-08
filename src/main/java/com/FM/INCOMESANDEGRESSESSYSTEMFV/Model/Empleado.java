
package com.FM.INCOMESANDEGRESSESSYSTEMFV.Model;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

enum Rol_Enum {
    ADMINISTRADOR, OPERATIVO
}

@Data
@Entity
@Table(name = "Empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;
    
    @Column
    private String nombreEmpleado, correo;
    
    @Column
    private Rol_Enum rol;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;
}
