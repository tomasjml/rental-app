package com.rental.app.backend.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Factura implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "fecha_facturacion")
    private Date fechaFacturacion;
    @Column(name = "total_facturado")
    private float totalFacturado;
}
