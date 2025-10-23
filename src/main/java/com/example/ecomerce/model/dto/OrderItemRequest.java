package com.example.ecomerce.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {}
