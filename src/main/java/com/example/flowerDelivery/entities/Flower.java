package com.example.flowerDelivery.entities;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="plant")
public class Flower extends Plant {

    @Id
    @GeneratedValue
    private Integer id;

    @Nationalized //should use @Nationalized instead of @Type=nstring
    private String name;
    private String color;

    @Column(precision = 12, scale = 4)
    private BigDecimal price;  //BigDecimal is the standard Java class for currency math

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
