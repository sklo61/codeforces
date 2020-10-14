/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cp2020.chapter4.findingconnectedcomponents;

import java.util.*;
import java.io.*;

public class wheresmyinternet {

    static boolean[] visited;
    static HashMap<Integer, List<Integer>> ht;

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

    static void dfs(int start) {
        visited[start] = true;
        for (int i : ht.get(start)) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner fs = new FastScanner();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ht = new HashMap<>();
        int nums = fs.nextInt();
        int lines = fs.nextInt();
        visited = new boolean[nums + 1];

        for (int i = 0; i < lines; i++) {
            int a = fs.nextInt();
            int b = fs.nextInt();

            if (ht.containsKey(a)) {
                ht.get(a).add(b);
            } else {
                ht.put(a, new ArrayList<>());
                ht.get(a).add(b);
            }

            if (ht.containsKey(b)) {
                ht.get(b).add(a);
            } else {
                ht.put(b, new ArrayList<>());
                ht.get(b).add(a);
            }
        }

        boolean flag = true;

        /**
         * if (!ht.containsKey(1)) { for(int i = 2; i <= nums; i++){
         * System.out.println(i); } }else{ LinkedList<Integer> queue = new
         * LinkedList<Integer>(); queue.add(1);
         *
         * while (!queue.isEmpty()) { int a = queue.pop();
         *
         * if (visited[a - 1] == false) { visited[a - 1] = true;
         *
         * for (int b : ht.get(a)) { if(visited[b-1] == false){ queue.add(b); }
         * } } }
         */
        if (ht.containsKey(1)) {
            dfs(1);
        }

        for (int i = 1; i < nums; i++) {
            if (visited[i] == false) {
                flag = false;
                break;
            }
        }

        if (flag == true) {
            System.out.println("Connected");
        } else {
            for (int i = 2; i < visited.length; i++) {
                if (!visited[i]) {
                    bw.append(i + "\n");
                }
            }
            bw.flush();
        }
    }
}

