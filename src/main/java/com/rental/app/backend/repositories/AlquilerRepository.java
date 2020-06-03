package com.rental.app.backend.repositories;

import com.rental.app.backend.models.Alquiler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlquilerRepository extends JpaRepository<Alquiler, Long> {

}
