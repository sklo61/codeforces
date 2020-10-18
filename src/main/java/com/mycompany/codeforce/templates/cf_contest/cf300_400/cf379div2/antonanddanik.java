/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cf300_400.cf379div2;

import java.util.*;
import java.io.*;

public class antonanddanik {

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

        String nextLine() throws IOException {
            return br.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner fs = new FastScanner();
        int games = fs.nextInt();
        char[] ch = fs.nextLine().toCharArray();

        int a = 0;
        int d = 0;
        
        

        for (char c : ch) {
            if (c == 'A') {
                a++;
            } else if (c == 'D') {
                d++;
            }
        }
        
        if(a > d){
            System.out.println("Anton");
        }else if(d > a){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }
    }

}
