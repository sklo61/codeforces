/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cp2020.chapter4.reachableroads;

import java.util.*;
import java.io.*;

public class reachableroads {

    static boolean[] visited;
    static HashMap<Integer, HashSet<Integer>> hmap;

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
        for (int a : hmap.get(start)) {
            if (!visited[a]) {
                dfs(a);
            }
        }

    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        FastScanner fs = new FastScanner();
        int cities = fs.nextInt();

        for (int i = 0; i < cities; i++) {
            int roads = fs.nextInt();
            int pairs = fs.nextInt();

            if (pairs < 1) {
                System.out.println(roads -1 );
            } else {
                hmap = new HashMap<>();
                int connectedGroup = 0;
                visited = new boolean[roads];

                // System.out.println(roads);
                //System.out.println(pairs);
                for (int j = 0; j < pairs; j++) {
                    int a = fs.nextInt();
                    int b = fs.nextInt();
                    if (hmap.containsKey(a)) {
                        hmap.get(a).add(b);
                    } else {
                        hmap.put(a, new HashSet<>());
                        hmap.get(a).add(b);
                    }

                    if (hmap.containsKey(b)) {
                        hmap.get(b).add(a);
                    } else {
                        hmap.put(b, new HashSet<>());
                        hmap.get(b).add(a);
                    }
                }

                for (int k = 0; k < roads; k++) {
                    if (!visited[k]) {
                        dfs(k);
                        connectedGroup++;
                    }

                }

                System.out.println(connectedGroup - 1);

            }
        }
    }

}
