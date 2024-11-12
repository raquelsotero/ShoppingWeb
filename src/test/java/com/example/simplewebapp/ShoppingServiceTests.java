package com.example.simplewebapp;

import com.example.simplewebapp.service.ShoppingService;
import com.example.simplewebapp.service.ShoppingServiceImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingServiceTests {

    private final ShoppingService shoppingService = new ShoppingServiceImpl();

    @Test
    void calculateTotal_noDiscountApplied() {
        double amount = 50.0;
        double expected = 50.0;
        double actual = shoppingService.calculateTotal(amount);
        assertEquals(expected, actual, "El total debería ser el mismo si el monto es menor al umbral de descuento.");
    }

    @Test
    void calculateTotal_discountApplied() {
        double amount = 150.0;
        double expected = 135.0;
        double actual = shoppingService.calculateTotal(amount);
        assertEquals(expected, actual, "El total debería aplicar un descuento del 10% si el monto supera el umbral.");
    }
}

