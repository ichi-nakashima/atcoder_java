package atcoder;

import java.io.IOException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());

        int[][] l = new int[Q][4];
        for (int i = 0; i < Q; i++) {
            l[i][0] += Integer.parseInt(sc.next());
            l[i][1] += Integer.parseInt(sc.next());
            l[i][2] += Integer.parseInt(sc.next());
            l[i][3] += Integer.parseInt(sc.next());
        }

        int[] A = new int[N];
        int[] ike = new int[M];
        for (int i = 1; i <= M; i++) {
            ike[i-1] = i;
        }


        int score = 0;
        for (int i = 0; i < Q; i++) {
            if ((l[i][1] - l[i][0]) == l[i][2]) score += l[i][3];
        }



        System.out.println();
    }
}

class FastScanner {
    private final java.io.InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) return buffer[ptr++];
        else return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return (minus ? -n : n);
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return (int) (minus ? -n : n);
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}

