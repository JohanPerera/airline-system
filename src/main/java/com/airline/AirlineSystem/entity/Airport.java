package com.airline.AirlineSystem.entity;

import javax.persistence.*;

@Entity
@Table(name="airports")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="country",nullable = false)
    private String country;

    public Airport(String name, String country) {
        super();
        this.name = name;
        this.country = country;
    }

    public Airport() {
        super();
    }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
