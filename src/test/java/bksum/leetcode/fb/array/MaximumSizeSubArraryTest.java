package bksum.leetcode.fb.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSizeSubArraryTest {
    private MaximumSizeSubArrary msArrary;

    @Before
    public void setUp() {
        msArrary = new MaximumSizeSubArrary();
    }

    @Test
    public void maxSubArrayLen() {
        assertEquals(4, msArrary.maxSubArrayLen(new int[]{1, -1, 5, -2, 3}, 3));
    }

    @Test
    public void maxSubArrayLen2() {
        assertEquals(2, msArrary.maxSubArrayLen(new int[]{-2, -1, 2, 1}, 1));
    }
}