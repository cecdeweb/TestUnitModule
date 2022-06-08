/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamestest;

import games.FizzBuzz;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Petit jeu solo
 * @author CECILE
 */
public class FizzBuzzTest {
    
    
    @Test
// Si notre nombre est multiple de 3 on dit à la place Fizz.
    void FizzBuzzIsMultipleOf3(){
       String  result = FizzBuzz.play(3);
       assertEquals("Fizz", result);
    }
    @Test
// S’il est multiple de 5 on dit à la place Buzz.
    void FizzBuzzIsMultipleOf5(){
       String  result = FizzBuzz.play(5);
       assertEquals("Buzz", result);
    }
    @Test
// S’il est multiple de 3 et 5 alors on le remplace par FizzBuzz
    void FizzBuzzIsMultipleOf3et5(){
       String  result = FizzBuzz.play(15);
       assertEquals("FizzBuzz", result);
    }
    @Test
//  Si retourne la valeur d'un nombre
    void FizzBuzzIsMultipleReturnNumber(){
       String  result = FizzBuzz.play(1);
       assertEquals("1", result);
    }
    
}
