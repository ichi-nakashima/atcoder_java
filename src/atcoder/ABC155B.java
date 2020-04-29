package atcoder;

import java.util.Scanner;

public class ABC155B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "APPROVED";
        for (int i = 0; i < Integer.parseInt(sc.next()); i++) {
            int n = Integer.parseInt(sc.next());
            if (n % 2 == 0 && (n % 3 != 0 && n % 5 != 0)) {
                result = "DENIED";
            }
        }
        System.out.println(result);
    }
}