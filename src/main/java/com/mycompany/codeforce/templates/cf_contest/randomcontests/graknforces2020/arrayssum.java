/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.randomcontests.graknforces2020;

import java.util.*;
import java.io.*;

public class arrayssum {

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
        int testcases = fs.nextInt();
        for (int i = 0; i < testcases; i++) {
            int digits = fs.nextInt();
            int allow = fs.nextInt();
            String[] arr = fs.nextLine().split(" ");
            int[] count = new int[101];
            int total = 0;
            
            for(String a: arr){
                count[Integer.parseInt(a)]++;
            }
            
            for(int b: count){
                if(b > 0){
                    total++;
                }
            }
            
            if(total > allow && allow == 1){
                System.out.println(-1);
            }else if(total == allow){
                System.out.println(1);
            }else if(total > allow && total < allow*2){
                System.out.println(2);
            }else if(total > allow*2 ){
                System.out.println(total/2 + 1);
            }

        }
    }

}
