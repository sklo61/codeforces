/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cf672div2;

/**
 *
 * @author 
 */
import java.util.*;
import java.io.*;

public class rockandlever {

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
        int testcase = fs.nextInt();

        for (int tc = 0; tc < testcase; tc++) {
            int digits = fs.nextInt();
            int[] a = new int[digits];
            for (int i = 0; i < digits; i++) {
                a[i] = fs.nextInt();
                //System.out.print(a[i]);
            }

            int count = 0;
            HashMap<Integer,Integer> hmap = new HashMap<>();
            for (int i: a) {
                 int bt = Integer.highestOneBit(i);
                 count+=hmap.getOrDefault(bt, 0);
                 hmap.put(bt, hmap.getOrDefault(bt, 0)+1);
            }
            out.println(count);

        }

        out.close();
    }

}
