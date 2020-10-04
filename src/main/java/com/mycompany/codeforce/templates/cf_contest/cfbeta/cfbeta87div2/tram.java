/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cfbeta.cfbeta87div2;

import java.util.*;
import java.io.*;

public class tram {

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
        int cases = fs.nextInt();

        int[] a = new int[cases];

        int[] b = new int[cases];

        for (int i = 0; i < cases; i++) {
            a[i] = fs.nextInt();
            b[i] = fs.nextInt();
        }
        
        int currtotal = b[0];
        int max = currtotal;
        //int remain = 0;
        for(int i = 1; i < cases; i++){
            
            currtotal = currtotal - a[i] + b[i];
            //int currtotal = currtotal + b[i];
            
            max = Math.max(max, currtotal);
        
        }
        
        System.out.println(max);
    }

}
