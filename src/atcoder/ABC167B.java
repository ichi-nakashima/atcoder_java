package atcoder;

import java.util.Scanner;

public class ABC167B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());
        long C = Long.parseLong(sc.next());
        long K = Long.parseLong(sc.next());
        long r = 0;
        for (int i = 0; i < Math.min(A,K); i++) {
            r++;
        }
        for (int i = 0; i < K - A - B; i++) {
            r--;
        }
        System.out.println(r);
    }
}
