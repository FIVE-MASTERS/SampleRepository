package com.FM.INCOMESANDEGRESSESSYSTEMFV.model;

import com.FM.INCOMESANDEGRESSESSYSTEMFV.enums.Enum_Rol;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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

    @Column(name = "Rol")
    private int rol;


    //"2022-09-13T01:53:34.599Z"
    @Column(name= "Fecha_Creacion")
    private LocalDate createAt;

    @Column(name= "Fecha_Actualizacion")
    private LocalDate updateAt;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;


    @OneToMany (mappedBy = "empleado")
    private List<MovimientoDinero> movimientosDeDineros;


}
