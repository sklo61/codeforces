/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cfbeta.cfbeta40div2;

import java.util.*;
import java.io.*;

public class translation {

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
        
        String nextLine() throws IOException{
            return br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner fs = new FastScanner();
        
        char[] a = fs.nextLine().toCharArray();
        char[] b = fs.nextLine().toCharArray();
        
        
        
       // boolean flag = true;
        int i = 0;
        int j = b.length-1;
        
        while(a[i] == b[j] && j > 0 ){
            ++i;
            --j;
        }
        
        //System.out.println(i);
        
        if(i == a.length-1 && a[i] == b[j])
            System.out.println("YES");
        else
            System.out.println("NO");
    }

  
}


