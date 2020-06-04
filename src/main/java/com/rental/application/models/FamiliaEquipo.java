package com.rental.application.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "familia_equipo")
public class FamiliaEquipo implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String nombre;
    private String descripcion;
    @OneToMany(mappedBy = "familiaEquipo", cascade = CascadeType.ALL)
    private Set<SubFamiliaEquipo> listaSubFamilias;

}
