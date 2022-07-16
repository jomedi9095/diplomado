package edu.umanizales.practicaclase.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class categoria {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nombre")//como se llama en la base de datos
    private String nombre;

    private BigDecimal precio;

    @ManyToOne
    private producto productocat;
}
