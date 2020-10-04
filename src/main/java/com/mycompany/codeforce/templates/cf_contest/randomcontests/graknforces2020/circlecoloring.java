/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.randomcontests.graknforces2020;

import java.util.*;
import java.io.*;

public class circlecoloring {

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

        String nextLine() throws IOException {
            return br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner fs = new FastScanner();
        int testcases = fs.nextInt();

        for (int i = 0; i < testcases; i++) {
            int digits = fs.nextInt();
            // System.out.println(fs.nextLine());
            String[] a = fs.nextLine().split(" ");
            String[] b = fs.nextLine().split(" ");
            String[] c = fs.nextLine().split(" ");
            //System.out.println(a.length);
            //  System.out.println(a[0]);
            // System.out.println(a[1]);
            //System.out.println(a[2]);
            String curr = a[0];
            System.out.print(a[0]);

            for (int j = 1; j < digits; j++) {

                if (j == digits - 1) {
                  if(!a[j].equals(a[0]) && !a[j].equals(curr)){
                      System.out.print(" ");
                      System.out.print(a[j]);
                  }else if(!b[j].equals(a[0]) && !b[j].equals(curr)){
                      System.out.print(" ");
                      System.out.print(b[j]);
                  }else{
                      System.out.print(" ");
                      System.out.print(c[j]);
                  }
                } else if (!a[j].equals(curr)) {
                    curr = a[j];
                    System.out.print(" ");
                    System.out.print(a[j]);
                } else if (!b[j].equals(curr)) {
                    curr = b[j];
                    System.out.print(" ");
                    System.out.print(b[j]);
                } else if (!c[j].equals(curr)) {
                    curr = c[j];
                    System.out.print(" ");
                    System.out.println(c[j]);
                }

            }
            System.out.println("");

        }

    }

}
