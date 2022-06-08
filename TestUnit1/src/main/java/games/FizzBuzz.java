/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package games;

/**
 *
 * @author CECILE
 */
public class FizzBuzz {
    
    public static String play(int number){
        
        String result;
       
        // number%15 == 0 is possible
        if( number%3 == 0 && number%5 == 0 ){
            result = "FizzBuzz";
        }else if( number%3 == 0 ){
            result = "Fizz";
        }else if( number%5 == 0 ){
            result = "Buzz";
        }else{
            result = String.valueOf( number );
        }
                
        return result;
    }
    
}
