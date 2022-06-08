/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mytestunit.demo.calculatortest;

import com.mytestunit.demo.calculator.Calculator;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CECILE
 */
public class CalculatorTest {
    
    @Test
    public void testAdd3plus2return5() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(3, 2);
        
        assertEquals(5, result);
    }
    
    @Test
    public void testAdd2plus1return3() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(2, 1);
        
        assertEquals(3, result);
    }
    
    @Test
    public void testNumberLarge() {
        Calculator calculator = new Calculator();
        
        int result = calculator.add(5000, 10000);
        
        assertTrue(result == 15000);
    }

    @Test
    public void testTwoObjects() {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        
        c1 = c2;
        
        assertSame(c1, c2);
    }
    
    @Test
    /**
     *  test max value integer
     */
    public void testMaxNumberOneAndTwo(){
         Calculator calculator = new Calculator();
         
         int result = calculator.max(1, 2);
         
         assertEquals(2, result);
        
    }

    @Test
    /**
     *  test max value negative numbers
     */
    public void testMaxNumberNegativeNumber(){
         Calculator calculator = new Calculator();
         
         int result = calculator.max(-1, -2);
         
         assertEquals(-1, result);
        
    }

    @Test
    /**
     *  test max value equals numbers
     */
    public void testMaxNumberEqualsNumber(){
         Calculator calculator = new Calculator();
         
         int result = calculator.max(1, 1);
         
         assertEquals(1, result);
        
    }

    @Test
    /**
     *  test max value operator numbers
     */
    public void testMaxNumber0(){
         Calculator calculator = new Calculator();
         
         int result = calculator.max(1+1, 1);
         
         assertEquals(2, result);
        
    }
    
    @Test
    /**
     *  test Divide Integer Result
     */
    public void testDivideIntResult(){
         Calculator calculator = new Calculator();
         
         int result = calculator.divide(10, 5);
         
         assertEquals(2, result);
        
    }
    @Test
    /**
     *  test Divide Exception Divide Zero
     */
    public void testDivideExceptionZero(){
         Calculator calculator = new Calculator();
         
         assertThrows ( ArithmeticException.class, () -> {
                calculator.divide(10, 0);
         });
        }
    
    @Test
    /**
     * test Number Odd
     */
    public void testGetNombresImpairs(){
        Calculator calculator = new Calculator();
        
        ArrayList<Integer> result = calculator.getNombresImpairs(5);
        
        assertEquals(3, result.size());
        assertTrue(result.contains(3));
        assertFalse(result.contains(2));
        assertTrue(result.containsAll(Arrays.asList(1, 3, 5)));

        ArrayList<Integer> target = new ArrayList<>();
        target.addAll(Arrays.asList(1, 3, 5));
        assertEquals(result.toString(), target.toString());

                    
    }

                
}
