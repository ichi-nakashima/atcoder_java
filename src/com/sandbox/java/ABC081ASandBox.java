package com.sandbox.java;

import java.util.Scanner;

class ABC081ASandBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.replace("0", "");
        System.out.println(s.length());
    }
}
