package com.example.flowerDelivery.dto;

import java.math.BigDecimal;

/*
* DTO : (Data transfer object) - purpose :
* 1.simplify and document interaction between front-end and Controller
* 2. Conceal database structures.
* 3. Limit the amount of data exchanged
* 4.  Customize display data to meet the needs of front end.
* */
public class PlantDTO {
    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
