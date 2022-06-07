/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mytestunit.demo.testunit1;

/**
 *
 * @author CECILE
 */
public class Calculator {
    
    public  int add(int a, int b) {
        return a + b;
    }
    
    public int max(int a, int b){
        return a>b ? a : b;
    }
    
    public int divide(int a, int b){
        if (b == 0)
            throw new IllegalArgumentException("Cannot divide by zero!");
        return a / b;
    }
    
}
