/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.randomcontests.vkup2012qualification1;

import java.util.*;
import java.io.*;

public class taxi {

    static class FastScanner {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner fs = new FastScanner();
        int nums = fs.nextInt();
        int total = 0;
        int[] arr = new int[nums];
        for(int i = 0; i < nums; i++){
            arr[i] = fs.nextInt();
        }
        
        Arrays.sort(arr);
        int prev = arr[nums-1];
        int pointer = 0;
       for(int i = nums-1; i >=0; i--){
           if(arr[i] == 4);
       }
        
        if(total % 4 == 0){
            System.out.println(total/4);
        }else{
            System.out.println(total/4+1);
        }
    }

  
}


