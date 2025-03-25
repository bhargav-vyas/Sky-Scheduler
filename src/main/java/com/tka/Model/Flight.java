package com.tka.Model;

import java.security.Identity;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;
import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name ="flights")
@NoArgsConstructor
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000") 
public class Flight {
	@Id
	@GeneratedValue (strategy =  GenerationType.IDENTITY)
	private Long id;
	private String flightNumber;
	private String departureAirport;
	private String arrivalAirport;
	private String departureTime;
	private String arrivalTime;
	private double price;
	private int availableSeats;
	
	

}
