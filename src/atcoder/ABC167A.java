package atcoder;

import java.util.Scanner;

public class ABC167A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        String r = "No";
        T = T.substring(0,T.length()-1);
        if (S.equals(T)) r = "Yes";
        System.out.println(r);
    }
}