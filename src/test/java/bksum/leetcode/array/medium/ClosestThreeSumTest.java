package bksum.leetcode.array.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClosestThreeSumTest {

    private ClosestThreeSum cts;

    @Before
    public void setUp(){
        cts = new ClosestThreeSum();
    }

    @Test
    public void threeSumClosest() {
        int[] numbers = new int[] {-1, 2, 1, -4};
        int target = 1;
        assertEquals(2, cts.threeSumClosest(numbers, target));
    }

    @Test
    public void threeSumClosest_2() {
        int[] numbers = new int[] {1, 1, 1, 0};
        int target = -100;
        assertEquals(2, cts.threeSumClosest(numbers, target));
    }

    @Test
    public void threeSumClosestBrute() {
        int[] numbers = new int[] {-1, 2, 1, -4};
        int target = 1;
        assertEquals(2, cts.threeSumClosestBrute(numbers, target));
    }

    @Test
    public void threeSumClosestBrute_2() {
        int[] numbers = new int[] {0,2,1,-3};
        int target = 1;
        assertEquals(0, cts.threeSumClosestBrute(numbers, target));
    }
}