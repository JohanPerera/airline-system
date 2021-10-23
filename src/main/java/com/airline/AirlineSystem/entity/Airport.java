package com.airline.AirlineSystem.entity;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "fromAirport", fetch = FetchType.EAGER)
    private List<Flight> fromFlightList;

    @OneToMany(mappedBy = "toAirport", fetch = FetchType.EAGER)
    private List<Flight> toFlightList;

    public Airport(String name, String country) {
        super();
        this.name = name;
        this.country = country;
    }

//    public Airport(String name, String country, List<Flight> fromFlightList, List<Flight> toFlightList) {
//        this.name = name;
//        this.country = country;
//        this.fromFlightList = fromFlightList;
//        this.toFlightList = toFlightList;
//    }

    public Airport() {
        super();
    }

    public List<Flight> getFromFlightList() {
        return fromFlightList;
    }

    public void setFromFlightList(List<Flight> fromFlightList) {
        this.fromFlightList = fromFlightList;
    }

    public List<Flight> getToFlightList() {
        return toFlightList;
    }

    public void setToFlightList(List<Flight> toFlightList) {
        this.toFlightList = toFlightList;
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
