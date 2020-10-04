/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.randomcontests.vkup2012qualification1;

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
        int realpass = 0;
        int[] arr = new int[testcases];
        for(int i = 0; i < testcases; i++){
            arr[i] = fs.nextInt();
            if(i == pass - 1){
                realpass = arr[i];
            }
        }    
            
            
         for(int i = 0; i < testcases; i++){  
            if(arr[i] <= 0 || arr[i] < realpass){
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