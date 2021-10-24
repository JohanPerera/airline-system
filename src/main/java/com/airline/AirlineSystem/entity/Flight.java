package com.airline.AirlineSystem.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="plane",nullable = false)
    private String plane;

    @ManyToOne
    @JoinColumn(name = "from_airport_id",nullable = false)
    private Airport fromAirport;

    @ManyToOne
    @JoinColumn(name = "to_airport_id",nullable = false)
    private Airport toAirport;

    @Column(name="departure_time",nullable = false)
    private Date depTime;

    @OneToMany(mappedBy = "flight",fetch = FetchType.LAZY)
    private List<Passenger> passengers;

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Flight() {
        super();
    }

    public Flight(String plane, Airport fromAirport, Airport toAirport, Date depTime) {
        super();
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

    public Date getDepTime() {
        return depTime;
    }

    public void setDepTime(Date depTime) {
        this.depTime = depTime;
    }
}
