package atcoder;

import java.util.Scanner;

class Beginner164A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());

        if (S <= W) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }

}
