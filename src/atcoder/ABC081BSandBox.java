package atcoder;

import java.util.Scanner;

class ABC081BSandBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(sc.next());
        }

        int result = 0;
        boolean flag = true;
        do {
            for (int i = 0; i < N; i++) {
                if (nums[i] % 2 != 0) {
                    flag = false;
                    break;
                }
                nums[i] /= 2;
            }
            if (flag) result++;
        } while (flag);
        System.out.print(result);
    }
}
