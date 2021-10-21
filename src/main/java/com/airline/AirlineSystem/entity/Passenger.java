package com.airline.AirlineSystem.entity;

import javax.persistence.*;

@Entity
@Table(name = "passengers")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name="mobile_number")
    private String mobileNumber;

    @Column(name="NIC",unique = true)
    private String NIC;

    public Passenger() {
        super();
    }

    public Passenger(String name, String mobileNumber, String NIC) {
        super();
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.NIC = NIC;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }
}
