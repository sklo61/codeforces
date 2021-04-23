/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.interview;

import java.util.*;
import java.io.*;

public class protein {

    private int lo, maxLen;

    public String longestPalindrome(String s) {
       

        List<Integer> lst = new LinkedList<>();
        
        for (int i = 0; i < s.length() - 1; i++) {
         //   extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            boolean result = extendPalindrome(s, i, i + 1); //assume even length.
            
            if(result == true){
                lst.add(i+1);
            }
        }
        
        return lst.toString();
        
    }

    private boolean extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length()) {
            if(s.charAt(j) != s.charAt(k)){
                return false;
            } 
            j--;
            k++;
        }
      
        
        return true;
        
    }

    public static void main(String[] args) {
        protein p1 = new protein();
        String a1 = p1.longestPalindrome("ab");
        String a2 = p1.longestPalindrome("aaaaaaaaaaaaaaaaaat");

        System.out.println(a1);
        
        
        
    }

}
