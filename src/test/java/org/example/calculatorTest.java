package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTest {

    @Test
    void add() {
    int expected = 4;
    int actual = new calculator().add(2,2);
    assertEquals(expected,actual);

    }

    @Test
    void testAdd() {
        int expected = 6;
        int actual = new calculator().add(2,2, 2);
        assertEquals(expected,actual);
    }

    @Test
    void subtract() {
        int expected = 0;
        int actual = new calculator().subtract(2,2);
        assertEquals(expected,actual);
    }

    @Test
    void multiply() {
        int expected = 12;
        int actual = new calculator().multiply(3,4);
        assertEquals(expected,actual);
    }

    @Test
    void divide() {
        int expected = 5;
        int actual = new calculator().divide(10,2);
        assertEquals(expected,actual);
        expected = 0;
        actual = new calculator().divide(1,2);
        assertEquals(expected,actual);
    }
}