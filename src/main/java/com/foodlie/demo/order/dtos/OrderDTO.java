package com.foodlie.demo.order.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.foodlie.demo.auth_users.dtos.UserDTO;
import com.foodlie.demo.auth_users.entity.User;
import com.foodlie.demo.enums.OrderStatus;
import com.foodlie.demo.enums.PaymentStatus;
import com.foodlie.demo.order.entity.OrderItem;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDTO {

    private Long id;

    private UserDTO user;

    private LocalDateTime orderDate;

    private BigDecimal totalAmount;

    private OrderStatus orderStatus;

    private PaymentStatus paymentStatus;

    private List<OrderItem> orderItems;


}
