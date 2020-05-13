package atcoder;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class CodeTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(new Solution2().solution(S));
    }
}

class Solution2 {
    public String solution(String S) {
        DecimalFormat df = new DecimalFormat("#,###.####");
        double s = Double.parseDouble(S);
        return df.format(s);
    }
}