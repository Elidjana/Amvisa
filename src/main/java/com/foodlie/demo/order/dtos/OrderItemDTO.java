package com.foodlie.demo.order.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.foodlie.demo.auth_users.dtos.UserDTO;
import com.foodlie.demo.enums.OrderStatus;
import com.foodlie.demo.enums.PaymentStatus;
import com.foodlie.demo.menu.entity.Menu;
import com.foodlie.demo.order.entity.Order;
import com.foodlie.demo.order.entity.OrderItem;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderItemDTO {

    private Long id;

    private Order order;

    private Menu menu;

    private int quantity;

    private BigDecimal pricePerUnit;


}
