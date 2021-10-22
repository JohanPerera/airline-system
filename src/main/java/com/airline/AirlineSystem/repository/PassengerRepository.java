package com.airline.AirlineSystem.repository;

import com.airline.AirlineSystem.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PassengerRepository extends JpaRepository <Passenger,Long>{

}
