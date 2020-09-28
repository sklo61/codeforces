/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cfbetaround1;

/**
 *
 * @author 
 * 
 * 
 */
import java.util.*;
import java.io.*;

public class theatresquare {
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
        Long height = fs.nextLong();
        Long width = fs.nextLong();
        Long stone = fs.nextLong();
        
        Long x = height%stone == 0 ? height/stone : (height/stone) + 1;
        Long y = width%stone == 0 ? width/stone : (width/stone) + 1; 
        
        System.out.println(x * y);
    }
}
