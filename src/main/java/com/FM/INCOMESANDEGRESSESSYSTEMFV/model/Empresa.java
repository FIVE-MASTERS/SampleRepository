package com.FM.INCOMESANDEGRESSESSYSTEMFV.model;


import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data

@Entity
@Table(name = "Empresas")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpresa;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String nit;

    @Column(name= "fecha_creacion")
    private LocalDate createAt;

    @Column(name= "fecha_actualizacion")
    private LocalDate updateAt;

    @OneToMany(mappedBy = "empresaEmpleado")
    private List<Empleado> empleados;
}
