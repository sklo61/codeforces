/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cf300_400.cf304div2;

import java.util.*;
import java.io.*;

public class soldierandbananas {

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
        int cost = fs.nextInt();
        int money = fs.nextInt();
        int bananas = fs.nextInt();
        int total = 0;
        for(int i = 0; i < bananas; i++){
            total += i+1;
        }
        
        if(total*cost > money)
            System.out.println(total*cost - money);
        else 
            System.out.println(0);
    }

  
}


