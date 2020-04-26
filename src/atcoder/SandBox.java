package atcoder;

class SandBox {
    static final int AGE = 1;
    static final int ADDRESS = 2;
    static final int HOGE = 40;
    public static void main(String[] args) {
       int judge = 20;
//       judge |= AGE;
       judge |= HOGE;
       System.out.println(judge);
    }
}
