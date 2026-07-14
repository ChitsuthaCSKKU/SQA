package com.example.junit6_labdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.jupiter.api.ClassOrderer;
import org.junit.jupiter.api.Nested;

@TestClassOrder(ClassOrderer.OrderAnnotation.class)
@TestMethodOrder(OrderAnnotation.class)
class OrderAnnotation_CalculatorTest {

	@Order(1)
    @Test
    void shouldAddTwoNumbers() {
        System.out.println("1️⃣ Addition test");
    }

    @Order(2)
    @Test
    void shouldSubtractTwoNumbers() {
        System.out.println("2️⃣ Subtraction test");
    }

    @Nested
    class AdvancedOperationsTests {

        @Order(3)
        @Test
        void shouldMultiplyTwoNumbers() {
            System.out.println("3️⃣ Multiplication test (nested)");
        }

        @Order(4)
        @Test
        void shouldDivideTwoNumbers() {
            System.out.println("4️⃣ Division test (nested)");
        }
    }
}
