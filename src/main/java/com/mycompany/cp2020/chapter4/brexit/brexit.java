/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cp2020.chapter4.brexit;

import java.util.*;
import java.io.*;

public class brexit {

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
        int nums = fs.nextInt();
        int partnership = fs.nextInt();
        int me = fs.nextInt();
        int first = fs.nextInt();
        int[] counter = new int[nums + 1];

        HashMap<Integer, ArrayList<Integer>> hmap = new HashMap<>();
        for (int i = 0; i < partnership; i++) {
            int a = fs.nextInt();
            int b = fs.nextInt();

            counter[a]++;
            counter[b]++;

            if (hmap.containsKey(a)) {
                hmap.get(a).add(b);
            } else {
                hmap.put(a, new ArrayList<>());
                hmap.get(a).add(b);
            }

            if (hmap.containsKey(b)) {
                hmap.get(b).add(a);
            } else {
                hmap.put(b, new ArrayList<>());
                hmap.get(b).add(a);
            }

        }

        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(first);
        counter[first] = 0;

        int[] half = new int[nums + 1];
        for (int i = 1; i < nums + 1; i++) {
            half[i] = counter[i] / 2;
        }

        boolean flag = false;

        while (!dq.isEmpty()) {
            int con = dq.pollFirst();
            //System.out.println(con);
            //System.out.println(me);
            if (con == me) {
                flag = true;
                break;
            }
            for (int next : hmap.get(con)) {
                counter[next]--;
                if (counter[next] == half[next]) {
                    dq.addLast(next);
                }
            }
        }

        if (!flag) {
            System.out.println("stay");
        }else{
            System.out.println("leave");
        }

    }

}
