package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTest {

    @Test
    void testMultiplication() {
        assertEquals(20, Multiplication.multiplication(4, 5));
        assertEquals(-20, Multiplication.multiplication(-4, 5));
        assertEquals(20, Multiplication.multiplication(-4, -5));
        assertEquals(0, Multiplication.multiplication(0, 5));
    }

    @Test
    void testMultiplyUsingLoop() {
        assertEquals(20, Multiplication.multiplyUsingLoop(4, 5));
        assertEquals(-20, Multiplication.multiplyUsingLoop(-4, 5));
        assertEquals(20, Multiplication.multiplyUsingLoop(-4, -5));
        assertEquals(0, Multiplication.multiplyUsingLoop(0, 5));
    }

    @Test
    void testMultiplyUsingRecursion() {
        assertEquals(15, Multiplication.multiplyUsingRecursion(3, 5));
        assertEquals(-15, Multiplication.multiplyUsingRecursion(-3, 5));
        assertEquals(15, Multiplication.multiplyUsingRecursion(-3, -5));
        assertEquals(0, Multiplication.multiplyUsingRecursion(0, 7));
    }

    @Test
    void testMultiplyUsingShift() {
        assertEquals(10, Multiplication.multiplyUsingShift(2, 5));
        assertEquals(-10, Multiplication.multiplyUsingShift(-2, 5));
        assertEquals(10, Multiplication.multiplyUsingShift(-2, -5));
        assertEquals(0, Multiplication.multiplyUsingShift(0, 7));
    }
}
