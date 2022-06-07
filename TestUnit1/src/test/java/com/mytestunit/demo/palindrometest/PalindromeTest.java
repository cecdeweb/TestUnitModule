/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mytestunit.demo.palindrometest;

import com.mystestunit.demo.palindrome.Palindrome;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CECILE
 */
public class PalindromeTest {

    @Test
    public void PalindromeTestTrueValue() {
        
        Palindrome pal = new Palindrome();
        boolean result = pal.isPalindrome("laval");
        assertTrue(result);
        
    }
    @Test
    public void PalindromeTestFalseValue() {
        
        Palindrome pal = new Palindrome();
        boolean result = pal.isPalindrome("blue");
        assertFalse(result);
        
    }
    @Test
    public void PalindromeTestTrueLongValue() {
        
        Palindrome pal = new Palindrome();
        boolean result = pal.isPalindrome("Engage le jeu que je le gagne");
        assertTrue(result);
        
    }
    @Test
    public void PalindromeTestTrueWhitoutPunctuation() {
        
        Palindrome pal = new Palindrome();
        boolean result = pal.isPalindrome("Et Luc colporte trop l'occulte");
        assertTrue(result);
        
    }
    @Test
    public void PalindromeTestTrueIgnoreCase() {
        
        Palindrome pal = new Palindrome();
        boolean result = pal.isPalindrome("Laval");
        assertTrue(result);
        
    }
    @Test
    public void PalindromeTestTrueWhitoutAccent() {
        
        Palindrome pal = new Palindrome();
        boolean result = pal.isPalindrome("Sèves");
        assertTrue(result);
        
    }
    
}
