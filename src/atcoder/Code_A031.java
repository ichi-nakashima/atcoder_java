package atcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code_A031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P_1 = Integer.parseInt(sc.next());
        int P_2 = Integer.parseInt(sc.next());
        int P_3 = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        int n = 1;
        List<Integer> list = new ArrayList<>();
        List<Integer> primeList = new ArrayList<>();
        while (true) {
            int flag = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1 || n % P_1 == 0 || n % P_2 == 0 || n % P_3 == 0 || n == 1) {
                list.add(n);
//                for(int i=2; i<=sqrt; i++) {
//                    // ステップ2：探索リストの先頭の数を素数とし、その倍数を探索リストから篩い落とす。
//                    // ※この時、既に篩い落とされた数（false）は除外する。
//                    int firstNum = i;
//                    if (targetNumbers[i]) {
//                        for (int j=i*firstNum; j<targetNumbers.length; j+=firstNum) {
//                            targetNumbers[j] = false;
//                        }
//                    }
//                }
            } else {
                primeList.add(n);
            }
            if (list.size() == k) break;
            n++;
        }
        System.out.println(list.get(k-1));
    }
}
