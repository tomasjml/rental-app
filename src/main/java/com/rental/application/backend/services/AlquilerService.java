package com.rental.app.backend.services;

import com.rental.app.backend.repositories.AlquilerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlquilerService {
    @Autowired
    private AlquilerRepository alquilerRepository;

}
