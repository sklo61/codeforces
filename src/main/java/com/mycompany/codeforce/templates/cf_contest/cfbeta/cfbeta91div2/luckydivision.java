/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cfbeta.cfbeta91div2;

import java.util.*;
import java.io.*;

public class luckydivision {

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
        String nm = fs.next();
        int num = Integer.parseInt(nm);

        char[] arr = nm.toCharArray();

        boolean flag = true;

        for (char c : arr) {
            if (c != '7' && c != '4') {
                flag = false;
            }

        }

        if (flag != false) {
            System.out.println("YES");
        } else if (num % 7 == 0 || num % 4 == 0 || num % 44 == 0 || num % 47 == 0 || num % 74 == 0 || num % 77 == 0 || num % 444 == 0 || num % 447 == 0 || num % 477 == 0 || num % 744 == 0 || num % 774 == 0 || num % 777 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
