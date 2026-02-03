package com.foodlie.demo.payment.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.foodlie.demo.auth_users.dtos.UserDTO;
import com.foodlie.demo.auth_users.entity.User;
import com.foodlie.demo.enums.PaymentGateway;
import com.foodlie.demo.enums.PaymentStatus;
import com.foodlie.demo.order.dtos.OrderDTO;
import com.foodlie.demo.order.entity.Order;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDTO {

    private Long Id;

    private Long orderId;

    private BigDecimal amount;

    private PaymentStatus paymentStatus;

    private String transactionId;

    private PaymentGateway paymentGateway;

    private String failureReason;

    private boolean success;

    private LocalDateTime paymentDate;

    private OrderDTO order;
    private UserDTO user;

}
