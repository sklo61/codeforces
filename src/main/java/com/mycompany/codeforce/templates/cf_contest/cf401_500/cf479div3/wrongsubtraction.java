/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cf401_500.cf479div3;

import java.util.*;
import java.io.*;

public class wrongsubtraction {

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
        char[] num = fs.next().toCharArray();
        int[] nums = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            nums[i] = num[i] - '0';
           // System.out.print(nums[i]);
        }
        int operation = fs.nextInt();
        int pointer = nums.length - 1;
       // System.out.println("");

        for (int i = 0; i < operation; i++) {
           // System.out.println("current: " + nums[pointer]);
            if (nums[pointer] == 0) {
                pointer--;
            } else {
                nums[pointer]--;
            }

            
        }

        for (int j = 0; j <= pointer; j++) {
                System.out.print(nums[j]);
            }
            System.out.println("");
    }

}
