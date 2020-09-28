/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cf673div2;

import java.util.*;
import java.io.*;

/**
 *
 * @author 
 */
public class copypaste {

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
       // PrintWriter out = new PrintWriter(System.out);
        FastScanner fs = new FastScanner();
        int testcase = fs.nextInt();

        outer:
        for (int tc = 0; tc < testcase; tc++) {
            int digits = fs.nextInt();
            int limit = fs.nextInt();

            if (digits == 0) {
                System.out.println(0);
                continue outer;
            }
            
            if(limit == 0){
                System.out.println(0);
                continue outer;
            }

            int[] a = new int[digits];
            int smallest = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < digits; i++) {
                a[i] = fs.nextInt();
                // System.out.print(a[i]);
                if (a[i] < smallest) {
                    smallest = a[i];
                    index = i;
                }

            }

            int count = 0;
            for (int i = 0; i < digits; i++) {
                if (i != index) {
                    count += ((limit - a[i]) / smallest);
                }
            }
            System.out.println(count);

        }
       // out.close();
    }
}
