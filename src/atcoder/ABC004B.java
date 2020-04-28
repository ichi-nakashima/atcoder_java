package atcoder;


import java.util.Scanner;

public class ABC004B {
    public static void main(String[] args) {
        String[][] board = new String[4][4];
        String[][] copy = new String[4][4];

        Scanner sc = new Scanner(System.in);
        int len = 4;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                board[i][j] = sc.next();
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                // ボードを180度回転させるのに逆順にコピーする
                copy[i][j] = board[3 - i][3 - j];
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(copy[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
