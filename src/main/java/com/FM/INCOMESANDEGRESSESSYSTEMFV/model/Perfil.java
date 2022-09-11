package com.FM.INCOMESANDEGRESSESSYSTEMFV.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "perfiles")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_perfil", nullable = false)
    private Long idPerfil;

    @Column(nullable = false)
    private String imagen;

    @Column(nullable = false)
    private String telefono;

     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "empleado_id")
     private Empleado empleado;
    
    @Column(name= "fecha_creacion")
    private LocalDate createAt;

    @Column(name= "fecha_actualizacion")
    private LocalDate updateAt;



}
