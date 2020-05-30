package com.rental.app.backend.entities;

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
@Table
public class SubFamiliaEquipos implements Serializable {
    @Id
    @GeneratedValue
    @Column
    private long id;
    @Column
    private String nombre;
    @Column
    private String descripcion;
    @ManyToOne
    private Set<FamiliaEquipo> familiaEquipo;
}
