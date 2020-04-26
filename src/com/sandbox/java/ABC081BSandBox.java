package com.sandbox.java;

import java.util.Scanner;

class ABC081BSandBox {
    static final int AGE = 1;
    static final int ADDRESS = 2;
    static final int HOGE = 40;

    public static void main(String[] args) {
        int judge = 1;
//       judge |= AGE;
        judge |= HOGE;
        System.out.println(judge);
    }
}
