package atcoder;

import java.util.Scanner;

public class ABC165B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = Long.parseLong(sc.next());
        long m = 100;
        int r = 0;
        while (m<K) {
            m += m * 0.01;
            r++;
        }
        System.out.println(r);
    }
}