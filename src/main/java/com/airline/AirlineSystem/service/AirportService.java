package com.airline.AirlineSystem.service;

import com.airline.AirlineSystem.entity.Airport;
import com.airline.AirlineSystem.entity.Flight;

import java.util.List;

public interface AirportService {

    List<Airport> getAllAirports();


    Airport addAirport(Airport airport);

    void deleteAirport(Long id);

    Airport updateAirport(Airport airport);

    Airport getAirportById(Long id);

}
