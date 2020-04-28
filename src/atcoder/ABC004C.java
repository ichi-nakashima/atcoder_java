package atcoder;


import java.util.Scanner;

public class ABC004C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] numList = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < (N %= 30); i++) {
            int idxA = (i % 5);
            int idxB = (i % 5) + 1;
            int c = numList[idxA];
            numList[idxA] = numList[idxB];
            numList[idxB] = c;
        }
        for (int n :
                numList) {
            System.out.print(n);
        }
    }
}
