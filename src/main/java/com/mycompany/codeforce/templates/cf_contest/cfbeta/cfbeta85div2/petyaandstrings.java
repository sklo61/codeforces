/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cfbeta.cfbeta85div2;

import java.util.*;
import java.io.*;

public class petyaandstrings {

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
        String one = fs.next().toLowerCase();
        String two = fs.next().toLowerCase();
        
        int flag = 0;
        
        for(int i = 0; i < one.length(); i++){
            if((int)one.charAt(i) > (int)two.charAt(i)){
                flag = 1;
                break;
            }else if((int)one.charAt(i) < (int)two.charAt(i)){
                flag = -1;
                break;
            }
        }
        System.out.println(flag);
    }

  
}


