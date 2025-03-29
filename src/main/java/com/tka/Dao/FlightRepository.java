package com.tka.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.Model.Flight;
import com.tka.Model.Users;

public interface FlightRepository extends JpaRepository<Flight, Long> {

	List<Flight> findByDepartureAirportAndArrivalAirport(String departureAirport, String arrivalAirport);


	List<Flight> findAll();
	
}
