package com.FM.INCOMESANDEGRESSESSYSTEMFV.Model;

import lombok.Data;

import javax.persistence.*;

@Data

@Entity
@Table(name = "Empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpresa;
    @Column
    private String nombre;
    @Column
    private String direccion;
    @Column
    private String telefono;
    @Column
    private String nit;
}
