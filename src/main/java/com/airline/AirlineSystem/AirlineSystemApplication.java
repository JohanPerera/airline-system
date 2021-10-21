package com.airline.AirlineSystem;

import com.airline.AirlineSystem.entity.Passenger;
import com.airline.AirlineSystem.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AirlineSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AirlineSystemApplication.class, args);
	}

	@Autowired
	private PassengerRepository passengerRepository;

	@Override
	public void run(String... args) throws Exception {
//		Passenger passenger1 = new Passenger("Ramesh","0784567852","985215463v");
//		passengerRepository.save(passenger1);
//
//		Passenger passenger2 = new Passenger("Sanjana","0775487541","999548754v");
//		passengerRepository.save(passenger2);
//
//		Passenger passenger3 = new Passenger("Arjuna","0715468754","859875462v");
//		passengerRepository.save(passenger3);


	}
}
