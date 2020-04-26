package com.sandbox.java;

import java.util.Scanner;

class ABC081B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int bit = 0;
        for (int i = 0; i < N; i++) {
            // |演算子, ２つの整数を比較するとき、一方のビットが1なら1を返す。両方0なら0を返す。
           bit |= Integer.parseInt(sc.next());
           System.out.println("in for of " + i + " = " + bit);
        }
        //ある数が2で割り切れるということは、2進数で表したときに1の位が0であるということと同じ意味です。
        //すなわち、ある数が2で何回割り切れるかは最下位から続く0の数を調べれば分かります。
        //全ての数のorを取った値に対してこの操作を行うと、最も2で割ることができる回数が小さい数についての答えを調べることができます。
        //最下位から続く0の数は、Integer.numberOfTrailingZeros()で調べることができます。
        System.out.println("final = " + bit);
        System.out.println(Integer.numberOfTrailingZeros(bit));
    }
    // 考察 奇数だったらビットの最下位桁が必ず1になる。なのでnumberOfTrailingZerosは0を返す
    // 偶数の場合、最下位から続く0の数 = 2で割れる回数。num /= 2 できる回数。
}
