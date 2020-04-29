package atcoder;

import java.util.Scanner;

public class ABC152B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String A = "";
        String B = "";
        for (int i = 0; i < Integer.parseInt(b); i++) {
            A += a;
        }
        for (int i = 0; i < Integer.parseInt(a); i++) {
            B += b;
        }
        System.out.print((A.compareTo(B)) < 0 ? A : B);
    }
}
//
//class FastScanner {
//    private final java.io.InputStream in = System.in;
//    private final byte[] buffer = new byte[1024];
//    private int ptr = 0;
//    private int buflen = 0;
//
//    private boolean hasNextByte() {
//        if (ptr < buflen) {
//            return true;
//        } else {
//            ptr = 0;
//            try {
//                buflen = in.read(buffer);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            if (buflen <= 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private int readByte() {
//        if (hasNextByte()) return buffer[ptr++];
//        else return -1;
//    }
//
//    private static boolean isPrintableChar(int c) {
//        return 33 <= c && c <= 126;
//    }
//
//    private void skipUnprintable() {
//        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
//    }
//
//    public boolean hasNext() {
//        skipUnprintable();
//        return hasNextByte();
//    }
//
//    public String next() {
//        if (!hasNext()) throw new NoSuchElementException();
//        StringBuilder sb = new StringBuilder();
//        int b = readByte();
//        while (isPrintableChar(b)) {
//            sb.appendCodePoint(b);
//            b = readByte();
//        }
//        return sb.toString();
//    }
//
//    public long nextLong() {
//        if (!hasNext()) throw new NoSuchElementException();
//        long n = 0;
//        boolean minus = false;
//        int b = readByte();
//        if (b == '-') {
//            minus = true;
//            b = readByte();
//        }
//        if (b < '0' || '9' < b) {
//            throw new NumberFormatException();
//        }
//        while (true) {
//            if ('0' <= b && b <= '9') {
//                n *= 10;
//                n += b - '0';
//            } else if (b == -1 || !isPrintableChar(b)) {
//                return (minus ? -n : n);
//            } else {
//                throw new NumberFormatException();
//            }
//            b = readByte();
//        }
//    }
//
//    public int nextInt() {
//        if (!hasNext()) throw new NoSuchElementException();
//        long n = 0;
//        boolean minus = false;
//        int b = readByte();
//        if (b == '-') {
//            minus = true;
//            b = readByte();
//        }
//        if (b < '0' || '9' < b) {
//            throw new NumberFormatException();
//        }
//        while (true) {
//            if ('0' <= b && b <= '9') {
//                n *= 10;
//                n += b - '0';
//            } else if (b == -1 || !isPrintableChar(b)) {
//                return (int) (minus ? -n : n);
//            } else {
//                throw new NumberFormatException();
//            }
//            b = readByte();
//        }
//    }
//}