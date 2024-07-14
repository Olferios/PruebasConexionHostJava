package com.pruebataller.avion.domain.service;

import com.pruebataller.avion.domain.entity.Avion;

public interface AvionService {
    
    void createAvion(Avion avion);
    void updateAvion(Avion avion);
    
    void deleteAvion(Avion avion);
}


