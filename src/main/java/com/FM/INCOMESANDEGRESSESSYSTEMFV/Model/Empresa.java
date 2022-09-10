package com.FM.INCOMESANDEGRESSESSYSTEMFV.Model;

<<<<<<< HEAD
=======
import lombok.AllArgsConstructor;
>>>>>>> ddd794d34acddf98bdb34091bb95197cd221f4ce
import lombok.Data;
import lombok.NoArgsConstructor;

<<<<<<< HEAD
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

=======
import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
>>>>>>> ddd794d34acddf98bdb34091bb95197cd221f4ce
@Data
@Entity
@Table(name = "Empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    private Long idEmpresa;
=======
    private long idEmpresa;

    @Column(nullable = false)
>>>>>>> ddd794d34acddf98bdb34091bb95197cd221f4ce
    private String nombre;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String nit;
}
