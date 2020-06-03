package com.rental.app.backend.repositories;

import com.rental.app.backend.models.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<Equipo,Long> {
}
