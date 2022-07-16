package edu.umanizales.practicaclase.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class itemCarro {

    @Id
    private Long id;

    @OneToMany(mappedBy = "id")
    private producto productoitemcarro;

    @ManyToOne
    private carroCompras carroComprasitemCarro;

}
