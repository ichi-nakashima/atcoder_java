package atcoder;

import java.util.Scanner;

public class Code_A28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = Integer.parseInt(sc.next());
        int P = Integer.parseInt(sc.next());
        int max = 0;
        for (int i = 1; i <= P; i++) {
            int X = S;
            int q = P;
            for (int j = i; j > 0; j--) {
                X = (j==1) ? X * (100 + q) / 100 : X * (100 + 1) / 100;
                q--;
            }
            max = Math.max(max, X);
        }
        System.out.println(max);
    }
}
