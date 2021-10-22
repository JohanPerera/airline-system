package com.airline.AirlineSystem.service.impl;

import com.airline.AirlineSystem.entity.Airport;
import com.airline.AirlineSystem.repository.AirportRepository;
import com.airline.AirlineSystem.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportServiceImpl implements AirportService {

    static{

    }

    public AirportServiceImpl() {
        Airport airport = new Airport("Katunayake","Sri Lanka");
        airportRepository.save(airport);


        airport = new Airport("London airline","England");
        airportRepository.save(airport);


        airport = new Airport("Shi ging","China");
        airportRepository.save(airport);
    }

    @Autowired
    AirportRepository airportRepository;

    @Override
    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }


}
