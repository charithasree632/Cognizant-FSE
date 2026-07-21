package com.example.JUnitDemo1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AAAPatternTest {

    private int number;

    // Setup method (runs before each test)
    @BeforeEach
    public void setUp() {
        number = 10;
        System.out.println("Setup completed");
    }

    // Test using Arrange-Act-Assert pattern
    @Test
    public void testAddition() {

        // Arrange
        int a = 5;
        int b = 3;

        // Act
        int result = a + b;

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testNumber() {

        // Arrange
        int expected = 10;

        // Act
        int actual = number;

        // Assert
        assertEquals(expected, actual);
    }

    // Teardown method (runs after each test)
    @AfterEach
    public void tearDown() {
        number = 0;
        System.out.println("Cleanup completed");
    }
}