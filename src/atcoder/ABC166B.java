package atcoder;

import java.util.Scanner;

public class ABC166B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());

        int[] n = new int[N];
        for (int i = 0; i < K; i++) {
            int d = Integer.parseInt(sc.next());
            for (int j = 0; j < d; j++) {
                int a = Integer.parseInt(sc.next());
                n[a-1] += 1;
            }
        }
        int r = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] == 0) r++;
        }
        System.out.println(r);
    }
}
