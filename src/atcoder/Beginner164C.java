package atcoder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Beginner164C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        Set<String> SList = new HashSet<>();
        for (int i = 0; i < N; i++) {
            SList.add(sc.next());
        }
        System.out.println(SList.size());
    }
}
