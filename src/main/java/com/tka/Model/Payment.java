package com.tka.Model;

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
public class Payment {
	@Id
	@GeneratedValue (strategy =  GenerationType.IDENTITY)
	private Long id;
	private Long bookingId;
	private Long PaymentgMethod;
	private double amount;
	private String status;

}
