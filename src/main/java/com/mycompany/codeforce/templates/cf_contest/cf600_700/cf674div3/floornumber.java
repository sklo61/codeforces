/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cf600_700.cf674div3;

/**
 *
 * @author 
 */
import java.util.*;
import java.io.*;

public class floornumber {

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
        //PrintWriter out = new PrintWriter(System.out);
        FastScanner fs = new FastScanner();
        int testcase = fs.nextInt();
        outer:
        for (int i = 0; i < testcase; i++) {
            int goal = fs.nextInt();
            int apartment = fs.nextInt();

            if (goal <= 2) {
                System.out.println(1);
                continue outer;
            }
            int remainder = (goal - 2) % apartment;
            int result = (goal - 2) / apartment;

            if (remainder == 0) {
                System.out.println(result + 1);
            } else {
                System.out.println(result + 2);
            }

        }

       // out.close();
    }
}
