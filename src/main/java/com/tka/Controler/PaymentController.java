package com.tka.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Dao.PaymentRepository;
import com.tka.Model.Payment;
import com.tka.Service.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	@Autowired
	private PaymentService  paymentService;
	
	
	@PostMapping("/process")
	public Payment processPayment(@RequestBody Payment payment) {
		return paymentService.processPayment(payment);
	}
	@GetMapping("/{id}")
	public Payment getpaymentById(@PathVariable Long  id) {
		return paymentService.getpaymentById(id);
	}
}
