package atcoder;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());

        int result = 0;
        int ave = (A + B) / 2;
        if (ave > C) {
            int minNum = Math.min(X, Y);
            if (minNum % 2 != 0) minNum--;

            result += C * minNum * 2;
            result += A * (X - minNum);
            result += B * (Y - minNum);
        } else {
            result += A * X;
            result += B * Y;
        }
        System.out.println(result);
    }
}
