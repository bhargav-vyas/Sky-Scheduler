package com.tka.Model;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000") 
public class Payment {
	@Id
	@GeneratedValue (strategy =  GenerationType.IDENTITY)
	private Long id;
	private Long bookingid;
	private Long PaymentMethod;
	private double amount;
	private String status;

}
