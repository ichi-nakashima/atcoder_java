package atcoder;

class BeginnerAlgo1 {
    public static void main(String[] args) {
        String s = "abc";
        //  同値判定
        if (s == "abc") System.out.println("equal");
        // 1文字の取り出し
        char c = s.charAt(1); // "b"
        System.out.println(c);
        // 文字の連結
        s = "def" + s + "ghi";
        System.out.println(s);
        // 文字の切り出し
        s = s.substring(3, 6); // "abc"
        System.out.println(s);
    }
}
