package com.andreasekman;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrianglesTest {

    private Triangles triangle;

    @Before
    public void setup()
    {
        this.triangle = new Triangles();
    }

    @Test
    public void testIsIscoscelesTriangle() throws Exception {

        boolean actual = triangle.isIscoscelesTriangle(10,10,12);


        assertEquals(true, actual);
    }

    @Test
    public void testIsNotIscoscelesTriangle() throws Exception {

        boolean actual = triangle.isIscoscelesTriangle(1,2,3);


        assertEquals(false, actual);
    }

}