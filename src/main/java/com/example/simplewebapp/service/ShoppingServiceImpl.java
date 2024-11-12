package com.example.simplewebapp.service;

import org.springframework.stereotype.Service;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    private static final double DISCOUNT_RATE = 0.1; // 10% de descuento
    private static final double DISCOUNT_THRESHOLD = 100.0; // Umbral de descuento

    @Override
    public double calculateTotal(double amount) {
        if (amount > DISCOUNT_THRESHOLD) {
            return amount - (amount * DISCOUNT_RATE);
        } else {
            return amount;
        }
    }
}

