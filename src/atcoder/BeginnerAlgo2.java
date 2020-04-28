package atcoder;

import java.util.HashMap;
import java.util.Map;

class BeginnerAlgo2 {
    public static void main(String[] args) {
        String[] s = {"yoyo", "hoge","avad", "git", "yoyo", "hoge", "hoge"};
        Map<String, Integer> hm = new HashMap<String, Integer>();
        for (int i = 0; i < s.length; i++) {
            if (!hm.containsKey(s[i])) {// 同一keyを探している
                hm.put(s[i], 0);
            } else {
                hm.put(s[i], hm.get(s[i]) + 1);
            }
        }
        for (String k :
                hm.keySet()) {
            System.out.println(k +"="+hm.get(k));
        }
    }
}
