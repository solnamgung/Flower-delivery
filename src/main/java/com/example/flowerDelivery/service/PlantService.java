package com.example.flowerDelivery.service;

import com.example.flowerDelivery.entities.Plant;
import org.springframework.stereotype.Service;

@Service
public class PlantService {
    public Plant getPlantByName(String name) {
        return new Plant();
    }
}
