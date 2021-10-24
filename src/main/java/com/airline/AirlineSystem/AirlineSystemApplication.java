package com.airline.AirlineSystem;

import com.airline.AirlineSystem.entity.Airport;
import com.airline.AirlineSystem.entity.Flight;
import com.airline.AirlineSystem.entity.Passenger;
import com.airline.AirlineSystem.repository.AirportRepository;
import com.airline.AirlineSystem.repository.FlightRepository;
import com.airline.AirlineSystem.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.List;

@SpringBootApplication
public class AirlineSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AirlineSystemApplication.class, args);
	}

//	@Autowired
//	AirportRepository airportRepository;

	@Override
	public void run(String... args) throws Exception {

//		Flight passenger = new Flight("sds",new Airport("sksks","America"),new Airport("sksks","Canada"),"20:45");
//		airportRepository.save(passenger);


//
//		Airport airport = new Airport("Katunayake","Sri Lanka");
//		airportRepository.save(airport);
//
//
//
//		airport = new Airport("London airline","England");
//		airportRepository.save(airport);
//
//
//		airport = new Airport("Shi ging","China");
//		airportRepository.save(airport);
	}
}
