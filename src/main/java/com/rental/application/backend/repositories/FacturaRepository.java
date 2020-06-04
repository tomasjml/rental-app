package com.rental.app.backend.repositories;

import com.rental.app.backend.models.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
}
