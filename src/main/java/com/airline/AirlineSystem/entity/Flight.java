package com.airline.AirlineSystem.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="plane")
    private String plane;

    @ManyToOne
    private Airport fromAirport;

    @ManyToOne
    private Airport toAirport;

    @Column(name="departure_time")
    private String depTime;

    public Flight() {
    }

    public Flight(String plane, Airport fromAirport, Airport toAirport, String depTime) {
        this.plane = plane;
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
        this.depTime = depTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    public Airport getFromAirport() {
        return fromAirport;
    }

    public void setFromAirport(Airport fromAirport) {
        this.fromAirport = fromAirport;
    }

    public Airport getToAirport() {
        return toAirport;
    }

    public void setToAirport(Airport toAirport) {
        this.toAirport = toAirport;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }
}
