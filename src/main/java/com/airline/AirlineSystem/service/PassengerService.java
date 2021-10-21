package com.airline.AirlineSystem.service;

import com.airline.AirlineSystem.entity.Passenger;

import java.util.List;

public interface PassengerService {

    List<Passenger> getAllPassengers();

    Passenger savePassenger(Passenger passenger);

    Passenger updatePassenger(Passenger passenger);

    Passenger getPassengerById(Long id);

    void deletePassengerById(Long id);

}
