package com.mycompany.codeforce.templates.cf_contest.cf672div2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuang
 */
import java.util.*;
import java.io.*;

public class cubessorting {

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

        //String strCurrentLine;

        outer:
        for (int tc = 0; tc < testcase; tc++) {
            int digits = fs.nextInt();
            //strCurrentLine = br.readLine();
            //System.out.println(strCurrentLine);
           // String[] arrays = strCurrentLine.split(" ");
            int[] a = new int[digits];
            for (int i = 0; i < digits; i++) {
                a[i] = fs.nextInt();
                // System.out.print(a[i]);
            }

            for (int i = 1; i < a.length; i++) {
                if (a[i] >= a[i - 1]) {
                    System.out.println("YES");
                    continue outer;
                }
            }
            System.out.println("NO");

        }

        out.close ();
    }

  
}

