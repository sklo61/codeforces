/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.vkup2012qualification1;

import java.util.*;
import java.io.*;

public class nextround {

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
        int testcases = fs.nextInt();
        int pass = fs.nextInt();
        int total = 0;
        for(int i = 0; i < testcases; i++){
            int digit = fs.nextInt();
            if(digit <= 0 || digit < pass){
                //System.out.println(total);
                break;
            }else
                total++;
        }
        System.out.println(total);
    }

  
}

/*
8 5
10 9 8 7 7 7 5 5
6



5 1
1 1 1 1 1
5
*/