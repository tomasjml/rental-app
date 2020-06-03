package com.rental.app.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Alquiler implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne(cascade = CascadeType.REMOVE)
    private Cliente cliente;
    private Estado estado;
    @Column(name = "fecha_alquiler")
    private Date fechaDeAlquiler;
    @Column(name = "fecha_devolucion_esperada")
    private Date fechaDevolucionEsperada;
    @Column(name = "fecha_devolucion_real")
    private Date fechaDevolcionReal;
    @ManyToMany(mappedBy = "alquiler", cascade = CascadeType.REMOVE)
    private Set<Equipo> listaDeEquiposRentados;
    @Column(name = "foto_perfil")
    private String fotoDePerfil;
}
