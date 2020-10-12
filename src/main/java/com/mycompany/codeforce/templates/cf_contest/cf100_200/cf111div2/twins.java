/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cf100_200.cf111div2;

import java.util.*;
import java.io.*;

public class twins {

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
        int[] arr = new int[nums];
        int total = 0;
        for(int i = 0; i < nums; i++){
            arr[i] = fs.nextInt();
            total += arr[i];
           // System.out.println(arr[i]);
        }
        
        Arrays.sort(arr);
        
        for(int i = 0; i < nums; i++){
            //arr[i] = fs.nextInt();
            //total += arr[i];
          //  System.out.println(arr[i]);
        }
        
        int record = 0;
        int subsum = 0;
        for(int i = nums-1; i>=0; i--){
            if(subsum > total/2){
                break;
            }
            subsum += arr[i];
            record+=1;
        }
        
       // System.out.println(subsum);
        System.out.println(record);
        
    }

  
}


