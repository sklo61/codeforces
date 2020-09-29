/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cfbeta65div2;

/**
 *
 * @author
 */
import java.util.*;
import java.io.*;

public class waytoolongwords {
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
        
        for(int i = 0; i < testcases; i++){
            String word = fs.next();
            int len = word.length();
            
            if(len > 10){
                System.out.println(word.charAt(0) + String.valueOf(len - 2) + word.charAt(len-1) + "");
            }else
                System.out.println(word);
            
        }
    }

}
