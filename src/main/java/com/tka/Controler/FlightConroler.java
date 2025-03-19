package com.tka.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Model.Flight;
import com.tka.Service.FlightService;
@RestController
@RequestMapping("/flights")

public class FlightConroler {
	@Autowired
	private FlightService flightService;
	
	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping("/create")
	public Flight addFlight(@RequestBody Flight flight) {
		return flightService.addFlight(flight);
	}
	
	@GetMapping("/search")
	public List<Flight> searchFlights(@RequestParam String departureAirport,@RequestParam String arrivalAirport){
		return flightService.searchFlights(departureAirport, arrivalAirport);	
	}
	
	
	
} 