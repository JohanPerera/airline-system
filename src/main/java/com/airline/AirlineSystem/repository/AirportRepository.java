package com.airline.AirlineSystem.repository;

import com.airline.AirlineSystem.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AirportRepository extends JpaRepository<Airport, Long> {

}
