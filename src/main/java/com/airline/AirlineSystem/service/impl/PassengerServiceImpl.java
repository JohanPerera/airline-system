package com.airline.AirlineSystem.service.impl;

import com.airline.AirlineSystem.entity.Passenger;
import com.airline.AirlineSystem.repository.PassengerRepository;
import com.airline.AirlineSystem.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    private PassengerRepository repo;

    @Override
    public Passenger savePassenger(Passenger passenger)
    {
        return repo.save(passenger);

    }

    @Override
    public Passenger updatePassenger(Passenger passenger) {
        return repo.save(passenger);
    }

    @Override
    public Passenger getPassengerById(Long id) {
        Passenger passenger = repo.findById(id).get();
        return passenger;
    }

    @Override
    public void deletePassengerById(Long id) {
        repo.deleteById(id);
    }


    @Override
    public List<Passenger> getAllPassengers() {
        return repo.findAll();
    }

}
