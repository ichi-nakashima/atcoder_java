package atcoder;


import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ABC167C {
    public static void main(String[] args) {
        // 与えられたNの√から探索を始めれば計算量より少なくすむのでは？
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        int[] c_list = new int[N];
        int[][] a_list = new int[N][M];
        for (int i = 0; i < N; i++) {
            c_list[i] = Integer.parseInt(sc.next());
            for (int j = 0; j < M; j++) {
                a_list[i][j] = Integer.parseInt(sc.next());
            }
        }
        int[] r = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                r[i] += a_list[i][j];
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(r[i]);
        }
    }
}

