package com.sandbox.java;

import java.util.*;

class ABC085BSandBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Set<Integer> num = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int di = Integer.parseInt(sc.next());
            num.add(di);
        }
        System.out.println(num.size());
    }
}
