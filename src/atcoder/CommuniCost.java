package atcoder;

import java.util.Scanner;

public class CommuniCost {
//    static final int tableA[][] = {{1,2,3,4},{5,6,7,8}};
//    static final int tableB[][] = {{9,10},{-1,11}};
//    static final int tableC[][] = {{12,13,-1,14,15},{16,17,18,19,20}};
    static final int tableA[][] = {{4,13,1,16},{8,15,17,19}};
    static final int tableB[][] = {{12,7},{-1,-1}};
    static final int tableC[][] = {{10,18,2,20,5},{3,6,11,9,14}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int costSum = 0;

        for (int i = 0; i < N; i++) {
            int X = Integer.parseInt(sc.next());
            int Y = Integer.parseInt(sc.next());
            switch (X) {
                case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:
                    costSum += getCost(X, Y, tableA);
                    break;
                case 9: case 10: case 11:
                    costSum += getCost(X, Y, tableB);
                    break;
                case 12:case 13:case 14:case 15:case 16:case 17:case 18:case 19:case 20:
                    costSum += getCost(X, Y, tableC);
                    break;
            }
        }
        System.out.println(costSum);
    }

    static int getCost(int X, int Y, int[][] table){
        int cost = 5;
        int indexXRow = -1;
        int indexXCol = -1;
        int indexYRow = -1;
        int indexYCol = -1;
        boolean existY = false;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (X == table[i][j]) {
                    indexXRow = i;
                    indexXCol = j;
                    // break した方がいい？
                }
                if (Y == table[i][j]) {
                    indexYRow = i;
                    indexYCol = j;
                    existY = true;
                }
            }
        }

        // 同じテーブルの人とのコミュニケーションコストを判定
        if (existY) {
            if (indexXRow == indexYRow) {
                cost = (indexXCol - 1 == indexYCol || indexXCol + 1 == indexYCol) ? 0 : 3;
            } else {
                if (indexXCol == indexYCol) {
                    cost = 1;
                } else {
                    cost = (indexXCol - 1 == indexYCol || indexXCol + 1 == indexYCol) ? 2 : 4;
                }
            }
        }

        return cost;
    }
}
