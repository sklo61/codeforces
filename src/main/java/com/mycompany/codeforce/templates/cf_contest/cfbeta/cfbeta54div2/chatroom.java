/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codeforce.templates.cf_contest.cfbeta.cfbeta54div2;

import java.util.*;
import java.io.*;

public class chatroom {

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
        char[] arr = fs.nextLine().toCharArray();
        
        for(char c: arr){
       //     System.out.println(c);
        }

        int[] ch = new int[5];
       // char prev = ''

        for (int i = 0; i < arr.length; i++) {
           // System.out.println(ch[i]);
            if (ch[0] == 0 && arr[i] == 'h') {
                ch[0] = 1;
            }else if (ch[0] != 0 && ch[1] == 0 &&  arr[i] == 'e') {
                ch[1] = 1;
            }else if (ch[1] != 0 && ch[2] == 0 && arr[i] == 'l') {
                ch[2] = 1;
            }else if (ch[2] != 0 && ch[3] == 0 && arr[i] == 'l') {
                ch[3] = 1;
            }else if (ch[3] != 0 && ch[4] == 0 && arr[i] == 'o') {
                ch[4] = 1;
            }

        }
       
        String flag = "YES";

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 0) {
                flag = "NO";
            }

        }

        System.out.println(flag);
            
        }
    }


