/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mystestunit.demo.palindrome;

import java.text.Normalizer;
import java.util.regex.Pattern;

/**
 *
 * @author CECILE
 */
public class Palindrome {
    
          public boolean isPalindrome(String phrase){
            
                    Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
                    String phraseSansAccent= (pattern.matcher(Normalizer.normalize(phrase, Normalizer.Form.NFD)).replaceAll(" ")).replaceAll("[\\s\\p{Punct}]", "");
                    
                    StringBuilder phraseRecto = new StringBuilder(phraseSansAccent);
                    String phraseVerso = phraseRecto.reverse().toString();
                    
                    System.out.println(phraseRecto);

                    return phraseVerso.equalsIgnoreCase(phraseSansAccent);
            
    }
    
}
