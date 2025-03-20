package com.tka.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tka.Model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
	

}
