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
@Table
public class Equipo implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String marca;
    private String modelo;
    private String descripcion;
    @Column(name="costo_alquiler_diario")
    private float costoAlquilerDiario;
    @Column(name="imagen_equipo")
    private String imagenEquipo;
    @Column(name="cantidad_existencia")
    private int cantidadEnExistencia;
    @ManyToMany
    private Set<Alquiler> listaDeAlquileres;
    @ManyToOne(fetch = FetchType.LAZY)
    private SubFamiliaEquipo subFamiliaDeEquipos;

    public int aumentarExistencia(){
        return 0;
    }

    public int disminuirExistencia(){
        return 0;
    }

    public int verificarCantidadExistencia(){
        return 0;
    }
}



