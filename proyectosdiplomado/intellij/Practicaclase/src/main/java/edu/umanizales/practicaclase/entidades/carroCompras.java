package edu.umanizales.practicaclase.entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity//con esto ya es una entidad.
@Data
public class carroCompras {

    @Id
    private  Long id;

    @OneToMany(mappedBy = "id")
    private List<itemCarro> itemCarrocarrocomp;


}
