/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cf201_300.cf267div2;

import java.util.*;
import java.io.*;

public class georgeandaccommodation {

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
        //out.print("Hello World!");
        //out.close ();
        int testcases = fs.nextInt();
        int counter = 0;
        for(int i = 0; i < testcases; i++){
            int first = fs.nextInt();
            int second = fs.nextInt();
            
            if(second - first >= 2){
                counter++;
            }
        }
        System.out.println(counter);
    }

  
}


