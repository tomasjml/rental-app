package com.rental.application.repositories;

import com.rental.application.models.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<Equipo,Long> {
}
