package com.tka.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flights")

public class FlightConroler {
	@Autowired
	private FlightService flightService;
	

}
