package bksum.leetcode.fb.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSizeSubArrayTest {

    private MinimumSizeSubArray subArray;

    @Before
    public void setUp(){
        subArray = new MinimumSizeSubArray();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void minSubArrayLenTest1() {
        assertEquals("Check logic!",2, subArray.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }

    @Test
    public void minSubArrayLenTestBrute1() {
        assertEquals("Check logic!",2, subArray.minSubArrayLenBrute(7, new int[]{2,3,1,2,4,3}));
    }

    @Test
    public void minSubArrayLenTest2() {
        assertEquals("Check logic!",1, subArray.minSubArrayLen(4, new int[]{1,4,4}));
    }
}