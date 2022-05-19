package com.example.flowerDelivery.entities;

import javax.persistence.Entity;

@Entity
public class Shrub extends Plant {
    private int heightCm; //any reasonable unit of measurement is fine.
    private int widThCm;

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    public int getWidThCm() {
        return widThCm;
    }

    public void setWidThCm(int widThCm) {
        this.widThCm = widThCm;
    }
}

