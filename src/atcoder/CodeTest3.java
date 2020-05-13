package atcoder;

import java.util.*;

public class CodeTest3 {
    public static void main(String[] args) {
        String[] S = {"add 5 3", "add 1 2", "get 5", "evict", "get 1", "remove 5", "exit"};
        for (int i : new Solution3().solution(S)) {
            System.out.println(i);
        }

    }
}

class Solution3 {
    Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
    String oldKey = "";

    public int[] solution(String[] A) {
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            String[] s = A[i].split(" ");
            switch (s[0]) {
                case "add":
                    add(Integer.parseInt(s[1]), Integer.parseInt(s[2]));
                    updateOldKey(s[1]);
                    break;
                case "get":
                    output.add(get(Integer.parseInt(s[1])));
                    updateOldKey(s[1]);
                    break;
                case "remove":
                    output.add(remove(Integer.parseInt(s[1])));
                    break;
                case "evict":
                    evict();
                    break;
                case "exit":
                    break;
            }
        }

        int l = output.size();
        int[] op = new int[l];
        Iterator<Integer> iter = output.iterator();
        for (int j = 0; j < l; j++) op[j] = iter.next();
        return op;
    }

    private void add(int K, int V) {
        hm.put(K, V);
    }

    private int get(int K) {
        try {
            return hm.get(K);
        } catch (Exception e) {
            return -1;
        }
    }

    private int remove(int K) {
        try {
            return hm.remove(K);
        } catch (Exception e) {
            return -1;
        }
    }

    private void evict() {
        if (!oldKey.isEmpty()) {
            hm.remove(Integer.parseInt(oldKey.substring(0, 1)));
        }
    }

    private void updateOldKey(String key) {
        oldKey = oldKey.replace(key, "");
        oldKey += key;
    }
}
