/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cf197div2;

import java.util.*;
import java.io.*;

public class helpfulmath {

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
        String[] s = fs.next().split("\\+");
        
        int[] in = new int[s.length];
        
        for(int i = 0; i < s.length; i++){
            in[i] = Integer.parseInt(s[i]);
        }
        
        Arrays.sort(in);
      //  System.out.println(in.toString());
        
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <in.length; i++){
            if(i == in.length -1){
                sb.append(in[i]);
            }else{
                sb.append(in[i]);
                sb.append("+");
            }
        
        }
        System.out.println(sb.toString());
    
    }
    
    

  
}


