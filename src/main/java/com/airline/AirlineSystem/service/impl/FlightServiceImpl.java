package com.airline.AirlineSystem.service.impl;

import com.airline.AirlineSystem.entity.Flight;
import com.airline.AirlineSystem.repository.FlightRepository;
import com.airline.AirlineSystem.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    FlightRepository flightRepository;

    public FlightServiceImpl() {
        super();
    }

    public FlightServiceImpl(FlightRepository flightRepository) {
        super();
        this.flightRepository = flightRepository;
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }

    @Override
    public Flight updateFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public Flight getFlightById(Long id) {
        return flightRepository.getById(id);
    }


}
