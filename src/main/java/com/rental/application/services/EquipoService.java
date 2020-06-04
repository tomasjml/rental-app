package com.rental.application.services;

import com.rental.application.repositories.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoService {
    //Inyeccion del repositorio
    @Autowired
    private EquipoRepository equipoRepository;
}
