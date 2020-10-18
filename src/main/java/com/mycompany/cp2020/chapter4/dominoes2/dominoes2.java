/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cp2020.chapter4.dominoes2;

import java.util.*;
import java.io.*;

public class dominoes2 {

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
        //PrintWriter out = new PrintWriter(System.out);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        FastScanner fs = new FastScanner();
        int cases = fs.nextInt();

        //System.out.println(tiles);
        //System.out.println(lines);
        //System.out.println(handlines);
        // System.out.println();
        for (int z = 0; z < cases; z++) {

            int tiles = fs.nextInt();
            int lines = fs.nextInt();
            int handlines = fs.nextInt();
            int totallines = lines + handlines;
            HashMap<Integer, ArrayList<Integer>>hmap = new HashMap<>();
            boolean[] visited = new boolean[tiles + 1];
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < lines; i++) {
                int a = fs.nextInt();
                int b = fs.nextInt();

                if (hmap.containsKey(a)) {
                    hmap.get(a).add(b);
                } else {
                    hmap.put(a, new ArrayList<>());
                    hmap.get(a).add(b);
                }

            }

            for (int i = 0; i < handlines; i++) {
                int c = fs.nextInt();
                queue.add(c);
            }

            int total = 0;

            while (!queue.isEmpty()) {
                int val = queue.poll();
                if (!visited[val]) {
                    visited[val] = true;

                    if (hmap.containsKey(val)) {
                        for (int d : hmap.get(val)) {
                            if (!visited[d]) {
                                queue.add(d);
                            }
                        }
                    }
                }
            }

            for (int y = 0; y < visited.length; y++) {
                if (visited[y]) {
                    total++;
                }
            }

            System.out.println(total);
        }

    }
}
