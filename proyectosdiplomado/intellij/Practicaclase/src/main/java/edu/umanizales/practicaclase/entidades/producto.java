package edu.umanizales.practicaclase.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false )
    private String nombre;

    @Column(name = "precio", nullable = false)
    private BigDecimal precio;

    @OneToMany(mappedBy = "id")//mapeando de la clase categoria al decir que se da un a relacion de 1 a muchos
    private categoria categoriapro;

    @ManyToOne
    private itemCarro itemCarroprod;



}
