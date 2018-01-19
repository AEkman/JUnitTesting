package com.andreasekman;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class FridgeTest {

    private Fridge fridge;

    @Before
    public void setup() {
        fridge = new Fridge();
    }

    @Test
    public void testFridgePutObject() {
        fridge.put("cheese");
        assertEquals(true, fridge.contains("cheese"));
    }

    @Test
    public void testFridgeTakeObject() throws NoSuchItemException {
        fridge.put("ham");
        fridge.take("ham");

        assertEquals(false, fridge.contains("ham"));
    }

    @Test (expected = NoSuchItemException.class)
    public void testFridgeWithItemThatDoesntExists() throws NoSuchItemException {
        fridge.take("sausage");
    }
}