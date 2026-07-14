package com.example.junit6_labdemo;

/**
 * We will test this class using JUnit 6.
 */
public class Calculator {

    /**
     * Returns the sum of two integers.
     */
    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * Returns the difference of two integers.
     */
    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    /**
     * Returns the multiplication of two integers.
     */
    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    /**
     * Divides the first integer by the second integer.
     * @throws ArithmeticException if the divisor is zero
     */
    public double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not permitted!!");
        }
        return (double) dividend / divisor;
    }
    
    /**
     * Returns he product of an integer multiplied by itself.
     */
    public int square(int number)
	{
		return number*number;
	}
}