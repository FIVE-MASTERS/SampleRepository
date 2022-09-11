package com.FM.INCOMESANDEGRESSESSYSTEMFV.model;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.enums.Enum_Rol;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Data
@Table(name = "Empleados")
@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpleado;

    @Column(name = "nombre")
    private String nombreEmpleado;

    @Column(name = "correo_empleado")
    private String correo;

    //(fetch = FetchType.LAZY)
    @OneToOne(mappedBy = "empleado")
    private Perfil perfil;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "empresa_empleado_id_empresa")
    private Empresa empresaEmpleado;

    @Enumerated(EnumType.STRING)
    @Column(name = "rol")
    private Enum_Rol rol;


    @OneToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_perfil")
    private Perfil perfil;

    @Column(name= "fecha_creacion")
    private LocalDate createAt;

    @Column(name= "fecha_actualizacion")
    private LocalDate updateAt;

    @OneToMany(mappedBy = "empleado")
    private List<MovimientoDinero> movimientosdeDineros;






}
