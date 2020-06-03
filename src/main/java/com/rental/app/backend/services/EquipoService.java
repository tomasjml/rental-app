package com.rental.app.backend.services;

import com.rental.app.backend.repositories.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoService {
    //Inyeccion del repositorio
    @Autowired
    private EquipoRepository equipoRepository;
}
