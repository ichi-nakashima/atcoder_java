package atcoder;

import java.util.Arrays;

public class UseComparable {
    public static void main(String[] args) {
        int[][] A = {{2, 8}, {2, 3}, {1, 5}, {5, 9}};

        Data[] d = new Data[A.length];

        for (int i = 0; i < A.length; i++) {
            d[i] = new Data(A[i][0], A[i][1]);
        }
        Arrays.sort(d);
        for (int i = 0; i < A.length; i++) {
           System.out.println(d[i].a + " " + d[i].b);
        }
    }

    // Comparable
    public static class Data implements Comparable<Data> {
        int a, b;

        public Data(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int compareTo(Data other) {
            if (this.a == other.a) {
                return this.b - other.b;
            } else {
                return this.a - other.a;
            }
        }

    }

}
