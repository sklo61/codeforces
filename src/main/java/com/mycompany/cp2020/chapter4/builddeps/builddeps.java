/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cp2020.chapter4.builddeps;

import java.util.*;
import java.io.*;

public class builddeps {

    static void dfs(HashMap<String, HashSet<String>> hmap, String s, HashSet<String> visited, ArrayList<String> list) {
        visited.add(s);

        for (String v : hmap.get(s)) {
            if (!visited.contains(v)) {
                dfs(hmap, v, visited, list);
            }
        }

        list.add(s);
    }

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
        // PrintWriter out = new PrintWriter(System.out);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        FastScanner fs = new FastScanner();
        int instructions = fs.nextInt();
        HashMap<String, HashSet<String>> hmap = new HashMap<>();
        HashSet<String> visited = new HashSet<>();
        for (int i = 0; i < instructions; i++) {
            String line = fs.nextLine();
            String[] aftersplit = line.split(":");

            if (aftersplit.length == 1) {
                if (!hmap.containsKey(aftersplit[0])) {
                    hmap.put(aftersplit[0],new HashSet<>());
                }
            } else {
                if (!hmap.containsKey(aftersplit[0])) {
                    hmap.put(aftersplit[0],new HashSet<>());
                }
                
                String[] pointers = aftersplit[1].split(" ");
                for (int j = 0; j < pointers.length; j++) {
                    if (hmap.containsKey(pointers[j])) {
                        hmap.get(pointers[j]).add(aftersplit[0]);
                    } else {
                        hmap.put(pointers[j], new HashSet<String>());
                        hmap.get(pointers[j]).add(aftersplit[0]);
                    }
                }
            }
        }
        String start = fs.next();
        //Queue<String> queue = new LinkedList<>();
        ArrayList<String> ans = new ArrayList<>();
        dfs(hmap, start, visited, ans);

        for (int i = ans.size() - 1; i >= 0; i--) {
            bw.write(ans.get(i) + "\n");
        }
        bw.flush();

    }
    /**
     * if (hmap.containsKey(start)) { queue.add(start); while (queue.size() > 0)
     * { String first = queue.poll(); if (!visit.contains(first)) {
     * visit.add(first); System.out.println(first); if (hmap.containsKey(first))
     * { for (String point : hmap.get(first)) { queue.add(point); } } } } }
     */

}
