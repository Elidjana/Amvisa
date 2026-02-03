package com.foodlie.demo.payment.repository;

import com.foodlie.demo.payment.dtos.PaymentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentDTO, Long> {





}

