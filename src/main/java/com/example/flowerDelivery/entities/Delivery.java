package com.example.flowerDelivery.entities;

import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Delivery {
    @Id
    @GeneratedValue
    private Long id;

    @Nationalized
    private String name;

    @Column(name = "address_full", length=500)
    private String address;

    private LocalDateTime deliveryTime; // includes both date and time - simpler than having two separate fields

    @Type(type="yes_no")
    private Boolean completed;

    //make sure to specify mappedBy. lazy fetch optional,
    // but often a good idea for collection attributes.
    // added CascadeType.REMOVE to automatically clear any associated plants when removed.

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "delivery", cascade = CascadeType.REMOVE)
    private List<Plant> plants;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }
}
