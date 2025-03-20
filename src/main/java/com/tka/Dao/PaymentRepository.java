package com.tka.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tka.Model.Payment;
@Repository

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
