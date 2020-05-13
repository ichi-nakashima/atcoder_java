package atcoder;

import java.util.*;

public class CodeTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(new Solution1().solution(S));
    }
}

class Solution1 {
    public int solution(String S) {
        List<String> list = Arrays.asList(S.split(""));
        HashSet<String> hs = new HashSet<>(list);
        HashSet<String> result = new HashSet<>();
        String check = "";
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (check.matches(".*" + s + ".*")) {
                result.add(s);
            } else {
                check += s;
            }
        }
        return result.size();
    }
}