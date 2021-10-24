package com.airline.AirlineSystem.service.impl;

import com.airline.AirlineSystem.entity.Airport;
import com.airline.AirlineSystem.entity.Flight;
import com.airline.AirlineSystem.repository.AirportRepository;
import com.airline.AirlineSystem.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportServiceImpl implements AirportService {

    @Autowired
    AirportRepository airportRepository;


    public AirportServiceImpl() {
        super();
    }


    @Override
    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    @Override
    public Airport addAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    @Override
    public void deleteAirport(Long id) {
        airportRepository.deleteById(id);
    }

    @Override
    public Airport updateAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    @Override
    public Airport getAirportById(Long id) {
        return airportRepository.getById(id);
    }


}
