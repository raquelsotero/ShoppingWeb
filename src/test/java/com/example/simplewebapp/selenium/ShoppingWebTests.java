package com.example.simplewebapp.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShoppingWebTests {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        //headfull
        //driver = new ChromeDriver();
    }

    @Test
    public void testCalculateTotalPage() {
        driver.get("http://127.0.0.1:8080/calculate-total?amount=150");
        WebElement totalText = driver.findElement(By.xpath("/html/body/p[2]"));
        assertEquals("Total con descuento: 135.0", totalText.getText(), "El total calculado debería mostrar un descuento aplicado.");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

