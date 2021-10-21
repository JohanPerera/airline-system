package com.airline.AirlineSystem.repository;

import com.airline.AirlineSystem.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PassengerRepository extends JpaRepository <Passenger,Long>{

}
