package bksum.leetcode.fb.dp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeBuySellStockTest {

    private BestTimeBuySellStock stock;

    @Before
    public void setUp() {
        stock = new BestTimeBuySellStock();
    }

    @Test
    public void maxProfit() {
        assertEquals(5, stock.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void maxProfit2() {
        assertEquals(0, stock.maxProfit(new int[]{7,6,4,3,1}));
    }

    @Test
    public void maxProfitSlow() {
        assertEquals(5, stock.maxProfitSlow(new int[]{7,1,5,3,6,4}));
    }
}