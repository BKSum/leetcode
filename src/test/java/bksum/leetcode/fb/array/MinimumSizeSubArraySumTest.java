package bksum.leetcode.fb.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSizeSubArraySumTest {

    private MinimumSizeSubArraySum minSub;

    @Before
    public void setUp() throws Exception {
        minSub = new MinimumSizeSubArraySum();
    }

    @Test
    public void minSubArrayLen() {
        int[] input = {2,3,1,2,4,3};
        int minSum = 7;
        assertEquals(2, minSub.minSubArrayLen(minSum, input));
    }

    @Test
    public void minSubArrayLen_emptyArray() {
        int[] input = {};
        int minSum = 100;
        assertEquals(0, minSub.minSubArrayLen(minSum, input));
    }
}