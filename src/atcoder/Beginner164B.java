package atcoder;

import java.util.Scanner;

class Beginner164B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int D = Integer.parseInt(sc.next());

        while (true) {
            C = C - B;
            if (C <= 0) {
                System.out.println("Yes");
                return;
            }
            A = A - D;
            if (A <= 0) {
                System.out.println("No");
                return;
            }
        }

    }
}
