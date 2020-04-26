package com.sandbox.java;

import java.util.Scanner;

class ABC086A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 単語 sc.next()
        // 整数 sc.nextInt()
        // 文字列１行 sc.nextLine()
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        System.out.println(((a * b) % 2 == 0) ? "Even" : "Odd");
    }
}
