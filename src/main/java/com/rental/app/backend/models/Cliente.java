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
public class Cliente implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String nombre;
    private String apellido;
    private String cedula;
    @Column(name = "foto_perfil")
    private String fotoDePeril;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Alquiler> misAlquileres;
}
