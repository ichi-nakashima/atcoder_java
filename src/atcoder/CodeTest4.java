package atcoder;

import java.util.Scanner;

public class CodeTest4 {
    public static void main(String[] args) {
        /**
         * examples
         *
         * input  : 1324,34,3214,341,4,13
         * output : 1451069576
         * input  : 21,21,
         * output : -1
         * input  : 1,2,3,4,5,5
         * output : 1451069576
         */
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split(",");
        int [] A = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            A[i] = Integer.parseInt(a[i]);
        }
        System.out.print(new Solution4().solution(A));
    }
}

class Solution4 {
    public int solution(int[] A) {
        if (A.length < 3) return -1;

        int count = A.length;
        int max = 0;

        // 時間計算量 o(n**3)
//        for (int i = 0; i < count - 2; i++) {
//            for (int j = i + 1; j < count - 1; j++) {
//                for (int k = j + 1; k < count; k++) {
//                    int result = A[i]*A[j]*A[k];
//                    max = Math.max(max, result);
//                }
//            }
//        }

        // 積計算なので交換法則により省略可能
        // 時間計算量 o(n**2)
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                int k = j+1;
                    int result = A[i]*A[j]*A[k];
                    max = Math.max(max, result);
            }
        }
        return max;
    }
}
