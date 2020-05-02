package atcoder;

import java.util.Scanner;

public class ABC165A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        String r = "NG";
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                r = "OK";
                break;
            }
        }
        System.out.println(r);
    }
}