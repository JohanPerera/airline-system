package com.airline.AirlineSystem.service;

import com.airline.AirlineSystem.entity.Flight;
import org.springframework.stereotype.Service;

import java.util.List;

public interface FlightService {

    List<Flight> getAllFlights();

    Flight addFlight(Flight flight);

    void deleteFlight(Long id);

    Flight updateFlight(Flight flight);

    Flight getFlightById(Long id);

}
