package com.airline.AirlineSystem.controller;

import com.airline.AirlineSystem.entity.Passenger;
import com.airline.AirlineSystem.repository.PassengerRepository;
import com.airline.AirlineSystem.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    public PassengerController(PassengerService passengerService) {
        super();
        this.passengerService = passengerService;
    }

    @GetMapping("/passengers")
    public String listPassengers(Model model){
        model.addAttribute("passengers",passengerService.getAllPassengers());
        return "passengers";
    }

    @GetMapping("/passengers/new")
    public String createPassenger(Model model){
        Passenger passenger = new Passenger();
        model.addAttribute("passenger",passenger);
        return "add_passenger";
    }

    @PostMapping("/passengers")
    public String savePassenger(@ModelAttribute("passenger") Passenger passenger){
        passengerService.savePassenger(passenger);
        return "redirect:/passengers";
    }

    @GetMapping("/passengers/edit/{id}")
    public String editPassengerForm(@PathVariable Long id, Model model){
        model.addAttribute("passenger",passengerService.getPassengerById(id));
        System.out.println(passengerService.getPassengerById(id).getName());
        return "edit_passenger";
    }

    @PostMapping("/passengers/{id}")
    public String updatePassenger(@PathVariable Long id, @ModelAttribute("passenger") Passenger passenger,Model model){
        Passenger existingPassenger = passengerService.getPassengerById(id);

        System.out.println("To update : "+id);

        existingPassenger.setId(id);
        existingPassenger.setName(passenger.getName());
        existingPassenger.setMobileNumber(passenger.getMobileNumber());
        existingPassenger.setNIC(passenger.getNIC());

         passengerService.updatePassenger(existingPassenger);
         return "redirect:/passengers";
    }



    @GetMapping("/passengers/{id}")
    public String deletePassenger(@PathVariable Long id){
        passengerService.deletePassengerById(id);
        return "redirect:/passengers";
    }
}
