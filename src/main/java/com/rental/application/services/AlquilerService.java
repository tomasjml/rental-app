package com.rental.application.services;

import com.rental.application.repositories.AlquilerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlquilerService {
    @Autowired
    private AlquilerRepository alquilerRepository;

}
