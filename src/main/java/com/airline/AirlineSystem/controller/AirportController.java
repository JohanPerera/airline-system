package com.airline.AirlineSystem.controller;

import com.airline.AirlineSystem.entity.Airport;
import com.airline.AirlineSystem.entity.Passenger;
import com.airline.AirlineSystem.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AirportController {

    @Autowired
    private AirportService airportService;

    public AirportController() {
        super();
    }

    public AirportController(AirportService airportService) {
        super();
        this.airportService = airportService;
    }

    @GetMapping("/airports")
    public String getAllAirports(Model model){
        model.addAttribute("airports",airportService.getAllAirports());
        return "airport";
    }

    @GetMapping("/airports/new")
    public String createAirportForm(Model model){
        Airport airport = new Airport();
        model.addAttribute("airport",airport);
        return "add_airport";
    }

    @PostMapping("/airports")
    public String saveAirport(@ModelAttribute("airport") Airport airport){
        airportService.addAirport(airport);
        return "redirect:/airports";
    }

    @GetMapping("/airports/edit/{id}")
    public String editAirportForm(@PathVariable Long id, Model model){
        model.addAttribute("airport",airportService.getAirportById(id));
        return "edit_airport";
    }

    @PostMapping("/airports/{id}")
    public String updateAirport(@PathVariable Long id, @ModelAttribute("airport") Airport airport){
        Airport existingAirport = airportService.getAirportById(id);

        existingAirport.setId(id);
        existingAirport.setName(airport.getName());
        existingAirport.setCountry(airport.getCountry());

        airportService.updateAirport(existingAirport);
        return "redirect:/airports";
    }



    @GetMapping("/airports/{id}")
    public String deleteAirport(@PathVariable Long id){
        airportService.deleteAirport(id);
        return "redirect:/airports";
    }

}
