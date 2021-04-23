/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cp2020.chapter4.conservation;

import java.util.*;
import java.io.*;

public class conservation {

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
            int n = fs.nextInt();
            int m = fs.nextInt();
            
            int[] labs = new int[n];
            int[]inbound = new int[n];
            
            for(int k = 0; k <n;k++){
                labs[k] = fs.nextInt();
            }
            
            HashMap<Integer, LinkedList<Integer>> mapping = new HashMap<>();
            
            
            for(int j = 0;j < m; j++){
                int a = fs.nextInt();
                int b = fs.nextInt();
                
                inbound[b]++;
                
                if(mapping.containsKey(a)){
                    mapping.get(a).add(b);
                }else{
                    mapping.put(a, new LinkedList<>());
                }
                
                
                
                
                
                
            }
        
        
        }
    }

  
}