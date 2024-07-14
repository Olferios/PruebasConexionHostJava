package com.pruebataller.avion.application;

import com.pruebataller.avion.domain.entity.Avion;
import com.pruebataller.avion.domain.service.AvionService;

public class CreateAvionUseCase {

    private final AvionService avionService;

    public CreateAvionUseCase(AvionService avionService) {
        this.avionService = avionService;
    }

    public void execute (Avion avion){
        avionService.createAvion(avion);
    }

}
