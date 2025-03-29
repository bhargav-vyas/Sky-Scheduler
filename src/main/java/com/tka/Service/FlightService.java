package com.tka.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Dao.FlightRepository;
import com.tka.Model.Flight;

@Service
public class FlightService {
	@Autowired
	private FlightRepository flightRepository;

	public List<Flight> searchFlights(String departureAirport, String arrivalAirport) {
		
		return flightRepository.findByDepartureAirportAndArrivalAirport(departureAirport,arrivalAirport);
	}

	public Flight addFlight(Flight flight) {
		return  flightRepository.save(flight);
	}

	public List<Flight> getallflight() {
		return flightRepository.findAll();
	}
	

}
