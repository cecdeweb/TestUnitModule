/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mytestunit.demo.testunit1.calculator;

import com.mytestunit.demo.testunit1.Calculator;
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

}
