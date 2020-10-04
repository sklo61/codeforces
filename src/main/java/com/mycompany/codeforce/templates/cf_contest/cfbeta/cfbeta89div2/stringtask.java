/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cfbeta.cfbeta89div2;

/**
 *
 * @author lo010
 */
import java.util.*;
import java.io.*;

public class stringtask {

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
        String original = fs.next().toLowerCase();
        char[] c = original.toCharArray();
        //System.out.println(c.length);
        StringBuilder arr = new StringBuilder();
        HashSet<Character> hset = new HashSet<>();
        hset.add('a');
        hset.add('o');
        hset.add('y');
        hset.add('e');
        hset.add('u');
        hset.add('i');
        for(int i = c.length-1; i >= 0; i--){
            //System.out.println(i);
           if(!hset.contains(c[i])){
               arr.insert(0, c[i]);
               arr.insert(0, '.');
           }
        }
        
        
        System.out.println(arr.toString());
        
    }

  
}

