package atcoder;

import java.util.Scanner;

public class ABC168B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = Integer.parseInt(sc.next());
        String S = sc.next();
        if (S.length() > K) S = S.substring(0, K) + "...";
        System.out.println(S);
    }
}
