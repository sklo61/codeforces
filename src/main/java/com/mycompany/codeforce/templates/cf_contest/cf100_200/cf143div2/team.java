/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cf100_200.cf143div2;

import java.util.*;
import java.io.*;

public class team {

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
        int testcases = fs.nextInt();
        
           int total = 0;
        for(int i = 0; i < testcases; i++){
         
            int a = fs.nextInt();
            int b = fs.nextInt();
            int c = fs.nextInt();
            
            int sum = a + b + c;
            
            if(sum > 1){
                total++;
            }
        }
        System.out.println(total);
    }

  
}


