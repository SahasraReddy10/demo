package org.example.Controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class AdditionControllerTest {
    AdditionController additionController = new AdditionController();
    @Test
    public void testAddNumbers() {
        int a = 5;
        int b = 10;
        int expectedResult = 15;

         int result= additionController.addNumbers(a,b);
         assertEquals(expectedResult, result);
    }
    @Test
    public void testNotEquals() {
        int a = 5;
        int b = 10;
        int expectedResult = 16;

        int result= additionController.addNumbers(a,b);
        assertNotEquals(expectedResult, result);
    }


    }











