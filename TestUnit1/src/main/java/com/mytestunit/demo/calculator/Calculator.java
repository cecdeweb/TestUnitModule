/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mytestunit.demo.calculator;

import java.util.ArrayList;

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
        return a / b;
    }
    
    public ArrayList<Integer> getNombresImpairs(int max){
        ArrayList<Integer> result = new ArrayList<>();
        
        for ( int i=0 ; i<=max ; i++ ){
            if ( i%2 != 0 ){
                result.add(i);
            }
        }
        
        return result;
    }
    
}
