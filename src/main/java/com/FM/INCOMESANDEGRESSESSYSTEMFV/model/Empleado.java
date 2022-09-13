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
    @Column(name = "id_empleado")
    private Long idEmpleado;

    @Column(name = "Nombre")
    private String nombreEmpleado;

    @Column(name = "Correo_Empleado")
    private String correo;

    @Enumerated(EnumType.STRING)
    @Column(name = "Rol")
    private Enum_Rol rol;

    //@OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "perfil_id")
    //private Perfil perfil;

    //"2022-09-13T01:53:34.599Z"
    @Column(name= "Fecha_Creacion")
    private LocalDate createAt;

    @Column(name= "Fecha_Actualizacion")
    private LocalDate updateAt;
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresaEmpleado;

    @OneToMany(mappedBy = "empleado")
    private List<MovimientoDinero> movimientosDeDineros;






}
