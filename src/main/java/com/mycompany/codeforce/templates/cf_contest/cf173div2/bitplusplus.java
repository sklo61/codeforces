/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cf173div2;

import java.util.*;
import java.io.*;

public class bitplusplus {

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
        int operation = fs.nextInt();
        
        String add = "X++";
        String add1 = "++X";
        String minus = "X--";
        String minus1 = "--X";
        int total = 0;
        
        for(int i = 0; i < operation; i++){
            String op = fs.next();
            
            if(op.equals(add) || op.equals(add1) ){
                total++;
            }else if(op.equals(minus) || op.equals(minus1))
                total--;
        }
        
        System.out.println(total);
    }

  
}


