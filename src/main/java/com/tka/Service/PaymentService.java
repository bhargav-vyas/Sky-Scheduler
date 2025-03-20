package com.tka.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Dao.PaymentRepository;
import com.tka.Model.Payment;

import jakarta.transaction.Transactional;
@Service
public class PaymentService {
	 @Autowired
	 private PaymentRepository paymentRepository;
	 
	 
	public Payment processPayment(Payment payment) {
		
		if(payment.getAmount() > 0) {
			payment.setStatus("completed");
		}
		else {
			payment.setStatus("Failed");
		}
		return paymentRepository.save(payment);
	}

@Transactional
	public Payment getpaymentById(Long id) {
		
		return paymentRepository.getById(id);
	}


	





}
