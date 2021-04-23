/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.special;

/**
 *
 * @author kuang
 */
import java.util.*;
import java.io.*;


public class NewClass2 {
       
    static int solve(int N, int[] arr){
        int totalCumulativeSum = 0;
        HashMap<Integer, Integer> prevNums = new HashMap<>();
       for(int i = 0 ; i < N; i++){
           totalCumulativeSum += arr[i];
       }
       
       int cumulativeSumToThisPoint = 0;
       //int start = -1;
       int newCumulativeSum = 0;
       
       for(int i = 0 ; i < N; i++){
           prevNums.put(arr[i],i);
           cumulativeSumToThisPoint += arr[i];
           int targetNumToRemove = 2 * cumulativeSumToThisPoint - totalCumulativeSum;
           
           if(prevNums.containsKey(targetNumToRemove)){
             //  start = i;
               int index = prevNums.get(targetNumToRemove);
               newCumulativeSum = totalCumulativeSum - (targetNumToRemove);
             //  System.out.println("index to change to 0: " + index);
              
             // changing the the number in that array index to 0
             arr[index] = 0;
               //System.out.println("index to cut:" + i);
               break;
           }
       }
    
       /**
       for(int num: arr){
           System.out.print(num);
           System.out.print(",");
       }
       */
       
      // System.out.println();
       // System.out.println(newCumulativeSum);
        
       
       //edgecases if all number in array ==0
        if(newCumulativeSum == 0){
            return arr.length-1;
        }
        
       int countPartition = 1;
       int newCurrCumulativeSum = 0;
       int indexToPartition = -1;
       
       for(int i = 0;i< N;i++){
           if(newCurrCumulativeSum == newCumulativeSum/2){
               indexToPartition = i;
               break;
           }
           newCurrCumulativeSum+=arr[i];     
       }
          
       for(int i = indexToPartition;i < N; i++){
          
           //if reaches the next non 0 number, 
           if(arr[i] != 0){
               break;
           }
           
           countPartition++;
       }
        
        return countPartition;
    }
    
    
    public static void main(String[] args){
      
        
        int[] ans = new int[]{0,0,0,-9,0,0,0,0,0};
      // int[] ans = new int[]{-1,5,0,0,5,0};
       // int[] ans = new int[]{-6,0,0,0,0,0,0,0,-6};
       //int[] ans = new int[]{0,-4,0,0,0,-4,0};
      // int[] ans = new int[]{0};
      // int[] ans = new int[]{0,-4,0,0,0,-4,0};
       
       System.out.println(solve(ans.length, ans));
 
    
    }
    
}