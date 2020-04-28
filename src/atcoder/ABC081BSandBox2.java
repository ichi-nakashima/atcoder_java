package atcoder;

import java.util.Scanner;

class ABC081BSandBox2 {
    public static void main(String[] args) {
        int inf = 1000000;// 十分大きな値
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(sc.next());
        }

        int result = inf;
        for (int i = 0; i < N; i++) {
            int count = 0;

            while (true) {
                if (nums[i] % 2 != 0) break;
                nums[i] /= 2;
                count++;
            }

            if (result > count) result = count;
        }

        System.out.print(result);
    }
}
