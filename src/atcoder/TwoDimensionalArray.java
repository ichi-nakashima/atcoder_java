package atcoder;

import java.util.Scanner;

public class TwoDimensionalArray {
    /**
     * 以下を実現したい。
     * 123 => arr[0][0]、arr[0][1]、arr[0][2]
     * 456 => arr[1][0]、arr[1][1]、arr[1][2]
     * 789 => arr[2][0]、arr[2][1]、arr[2][2]
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        int len = inputStr.length();
        int question[][] = new int[][]{};

        for (int i = 0; i < len; i++) {
            if (i >= 1) inputStr = sc.nextLine();

            for (int j = 0; j < len; j++) {
                question[i][j] = Integer.parseInt(String.valueOf(inputStr.charAt(j)));
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(question[i][j]);
            }
            System.out.println("");
        }
    }
}
