/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




package com.mycompany.codeforce.templates.cf_contest.special;

import java.util.*;
import java.io.*;

/**
 *
 * @author kuang
 */
public class NewClass {
    
    static int solve(int N, int K, String S){
       // System.out.println(S);
        
      //  int target = K;
        char[] c = S.toCharArray();
        int totalOne = 0;
        int studentCounter = 0;
        int temptotal = 1;
        int totalMethod = 1;
        
        //edgecase if num of student is oddNumber
        for(int i = 0; i < c.length; i++){
            if(c[i] == '1'){
                totalOne++;
            }
        }
        //edgecase if num of student is oddNumber
        if(totalOne%K != 0 || totalOne == 0){
            return -1;
        }
        
        for(int i = 0; i < N; i++){
            if(c[i] == '0' && studentCounter == K ){
                temptotal++;
                
            }else if(c[i] == '1'){
                if(studentCounter == K){
                    //System.out.println("rounds");
                    totalMethod = (totalMethod * temptotal)%1000000007;
                    //System.out.println(totalMethod);
                    //System.out.println(temptotal);
                    studentCounter = 1;
                    temptotal = 1;
                }else{
                    studentCounter++;
                }
               
            }
        }
        
        return totalMethod;
    }
    
    
    public static void main(String[] args){
       // System.out.println("hey");
         System.out.println("sample input 1 : " + (solve(9, 3, "110100111"))); 
               
        System.out.println("sample input 2 : " + (solve(13, 10, "000000000000")));
         System.out.println("sample input 3 : " + (solve(12, 9, "000001000000")));
        System.out.println("sample input 4 : " + (solve(15, 2, "011111110011111")));
         
         
       
         System.out.println((solve(8, 2, "11011011")));
          System.out.println((solve(6, 1, "101010")));
       
       
        System.out.println((solve(13, 2, "1100110000011")));
    

        
        
       //System.out.println((solve(15, 2, "011111110011111")));
      
         System.out.println((solve(4, 1, "1111")));
          System.out.println((solve(2, 1, "11")));

    
    }
    
}
