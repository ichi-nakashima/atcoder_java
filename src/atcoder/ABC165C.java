package atcoder;

import java.util.Scanner;

public class ABC165C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());

        int[][] l = new int[Q][4];
        for (int i = 0; i < Q; i++) {
            l[i][0] += Integer.parseInt(sc.next());
            l[i][1] += Integer.parseInt(sc.next());
            l[i][2] += Integer.parseInt(sc.next());
            l[i][3] += Integer.parseInt(sc.next());
        }

        int[] A = new int[N];
        int[] ike = new int[M];
        for (int i = 1; i <= M; i++) {
            ike[i-1] = i;
        }

        int score = 0;
        for (int i = 0; i < Q; i++) {
            if ((l[i][1] - l[i][0]) == l[i][2]) score += l[i][3];
        }

        System.out.println();
    }
}

