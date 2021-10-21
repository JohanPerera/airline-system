package com.airline.AirlineSystem.controller;

import com.airline.AirlineSystem.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AirportController {

    @Autowired
    private AirportService airportService;

    public AirportController(AirportService airportService) {
        super();
        System.out.println("airport controller called");
        this.airportService = airportService;
    }

    @GetMapping("/airports")
    public String getAllAirports(Model model){
        model.addAttribute("airports",airportService.getAllAirports());
        return "airport";
    }

}
