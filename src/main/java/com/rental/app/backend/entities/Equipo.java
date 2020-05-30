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
public class Equipo implements Serializable {
    @Id
    @GeneratedValue
    @Column
    private long id;
    @Column
    private String marca;
    @Column
    private String modelo;
    @Column
    private String descripcion;
    @Column(name="costo_alquiler_diario")
    private float costoAlquilerDiario;
    @Column(name="imagen_equipo")
    private String imagenEquipo;
    @Column(name="cantidad_existencia")
    private int cantidadEnExistencia;
    @Column(name="lista_alquileres")
    private Set<Alquiler> listaDeAlquileres;

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



