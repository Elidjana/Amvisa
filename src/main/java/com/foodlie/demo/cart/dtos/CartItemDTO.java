package com.foodlie.demo.cart.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.foodlie.demo.cart.entity.Cart;
import com.foodlie.demo.menu.dtos.MenuDTO;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CartItemDTO {

   private Long id;

   private Cart cart;

   private MenuDTO menu;

   private int quantity;

   private BigDecimal pricePerUnit;

   private BigDecimal subtotal;
}
