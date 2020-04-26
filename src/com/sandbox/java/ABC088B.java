package com.sandbox.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class ABC088B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        List<Integer> numlist = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            numlist.add(Integer.parseInt(sc.next()));
        }
        //配列のソートにはArrays.sort()を使います。
        //また、今回は降順にソートしたいため、2番目の引数にComparator.reverseOrder()を渡します。
        //ちなみに、Listのソートを行いたいときは、Collections.sort()を使います。
        //Javaでは配列よりもListを使うことの方が多いため、そちらを利用することの方が多いかもしれません。
        numlist.sort(Comparator.reverseOrder());
        int Alice = 0;
        int Bob = 0;
        for (int i = 0; i < numlist.size(); i++) {
            if (i % 2 == 0) {
                Alice += numlist.get(i).intValue();
            } else {
                Bob += numlist.get(i).intValue();
            }
        }
        System.out.println(Alice - Bob);
    }
}
