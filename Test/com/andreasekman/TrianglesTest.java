package com.andreasekman;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;

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

    @Test
    public void testWithZeroSides() throws Exception {
        boolean actual = triangle.isIscoscelesTriangle(0,0,0);

        assertFalse(actual);
    }

    @Test
    public void testAllSidesAreEqual() throws Exception {
        boolean actual = triangle.isIscoscelesTriangle(10,10,10);

        assertFalse(actual);
    }

    @Test
    public void testBrokenTriangle() throws Exception {
        boolean actual = triangle.isIscoscelesTriangle(100,101,102);

        assertFalse(actual);
    }

}