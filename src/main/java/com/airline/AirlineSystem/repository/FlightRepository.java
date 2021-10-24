package com.airline.AirlineSystem.repository;

import com.airline.AirlineSystem.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
