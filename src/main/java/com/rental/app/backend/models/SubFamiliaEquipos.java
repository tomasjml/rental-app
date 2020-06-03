package com.rental.app.backend.models;

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
@Table(name = "sub_familia_equipo")
public class SubFamiliaEquipos implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String nombre;
    private String descripcion;
    @Column(name = "familia_equipo")
    @ManyToOne
    private FamiliaEquipo familiaEquipo;
    @OneToMany(mappedBy = "sub_familia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Equipo> listaEquipos;
}
