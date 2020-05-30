package com.rental.app.backend.entities;

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
    @Column
    private long id;
    @Column(name = "fecha_alquiler")
    private Date fechaDeAlquiler;
    @Column(name = "fecha_devolucion_esperada")
    private Date fechaDevolucionEsperada;
    @Column(name = "fecha_devolucion_real")
    private Date fechaDevolcionReal;
    @Column(name = "lista_equipos_rentados")
    @OneToMany(mappedBy = "alquiler", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Equipo> listaDeEquiposRentados;
    @Column(name = "foto_perfil")
    private String fotoDePerfil;

}
