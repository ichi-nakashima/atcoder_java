package atcoder;

import java.util.Scanner;

public class ABC166C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] H = new int[N];
        int[] R = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(sc.next());
            R[i] = 1;
        }
        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int ha = H[a - 1];
            int hb = H[b - 1];
            if (ha > hb) {
                R[b - 1] = 0;
            } else {
                R[a - 1] = 0;
            }
            if (ha == hb) {
                R[a - 1] = 0;
                R[b - 1] = 0;
            }
        }
        int r = 0;
        for (int i:
                R) {
            if (i == 1) r++;
        }

        System.out.println(r);
    }
}
