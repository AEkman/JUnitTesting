package com.andreasekman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquaresTest {

    private static Squares square;

    @Before
    public void setup()
    {
        this.square = new Squares();
    }

    @Test
    public void isSquare(){

        boolean result = square.isSquare(10,10);

        assertTrue(result == true);
    }

    @Test
    public void isNotSquare(){

        boolean result = square.isSquare(10,11);

        assertTrue(result == false);
    }

    @Test
    public void squareWithNegativeNumbers(){

        boolean result = square.isSquare(-10,10);

        assertTrue(result == false);
    }
}