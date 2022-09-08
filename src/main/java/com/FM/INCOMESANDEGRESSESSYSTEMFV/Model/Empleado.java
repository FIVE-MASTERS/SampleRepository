
package com.FM.INCOMESANDEGRESSESSYSTEMFV.Model;

<<<<<<< HEAD
=======
import lombok.AllArgsConstructor;
>>>>>>> ddd794d34acddf98bdb34091bb95197cd221f4ce
import lombok.Data;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
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
=======
import javax.persistence.*;


enum Rol_Enum { ADMINISTRADOR,OPERATIVO
}
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Empleados")
>>>>>>> ddd794d34acddf98bdb34091bb95197cd221f4ce
@Entity
@Table(name = "Empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    private Long idEmpleado;
    
    @Column
    private String nombreEmpleado, correo;
    
    @Column
    private Rol_Enum rol;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;
=======
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



>>>>>>> ddd794d34acddf98bdb34091bb95197cd221f4ce
}
