package com.tka.Model;

import java.security.Identity;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Flight {
	@Id
	@GeneratedValue (strategy =  GenerationType.IDENTITY)
	private Long id;
	private String flightNumber;
	private String departureAirport;
	private String arrivalAirport;
	
	

}
