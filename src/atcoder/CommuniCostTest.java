package atcoder;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CommuniCostTest {
    static final int tableA[][] = {{1,2,3,4},{5,6,7,8}};
    static final int tableB[][] = {{9,10},{-1,11}};
    static final int tableC[][] = {{12,13,-1,14,15},{16,17,18,19,20}};

    @Test
    public void 隣同士1() throws Exception {
        int expected = 0;
        int actual = CommuniCost.getCost(3, 4, tableA);
        assertThat(actual, is(expected));
    }

    @Test
    public void 隣同士2() throws Exception {
        int expected = 0;
        int actual = CommuniCost.getCost(2, 3, tableA);
        assertThat(actual, is(expected));
    }

    @Test
    public void 正面1() throws Exception {
        int expected = 1;
        int actual = CommuniCost.getCost(2, 6, tableA);
        assertThat(actual, is(expected));
    }

    @Test
    public void 正面右() throws Exception {
        int expected = 2;
        int actual = CommuniCost.getCost(2, 7, tableA);
        assertThat(actual, is(expected));
    }

    @Test
    public void 正面左() throws Exception {
        int expected = 2;
        int actual = CommuniCost.getCost(2, 5, tableA);
        assertThat(actual, is(expected));
    }

    @Test
    public void 隣同士以外の同じサイド1() throws Exception {
        int expected = 3;
        int actual = CommuniCost.getCost(2, 4, tableA);
        assertThat(actual, is(expected));
    }

    @Test
    public void 隣同士以外の同じサイド2() throws Exception {
        int expected = 3;
        int actual = CommuniCost.getCost(5, 7, tableA);
        assertThat(actual, is(expected));
    }

    @Test
    public void 正面正面右左以外の反対サイド() throws Exception {
        int expected = 4;
        int actual = CommuniCost.getCost(1, 8, tableA);
        assertThat(actual, is(expected));
    }

    @Test
    public void 別のテーブル1() throws Exception {
        int expected = 5;
        int actual = CommuniCost.getCost(20, 10, tableA);
        assertThat(actual, is(expected));
    }


    @Test
    public void 別のテーブル2() throws Exception {
        int expected = 5;
        int actual = CommuniCost.getCost(8, 19, tableA);
        assertThat(actual, is(expected));
    }
}
