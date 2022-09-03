package com.FM.INCOMESANDEGRESSESSYSTEMFV.Model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;




@Data

@Entity
@Table(name = "Empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpresa;
    private String nombre;
    private String direccion;
    private String telefono;
    private String nit;
}
