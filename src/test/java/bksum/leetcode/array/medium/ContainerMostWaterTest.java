package bksum.leetcode.array.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerMostWaterTest {

    private ContainerMostWater cmw;

    @Before
    public void setUp(){
        cmw = new ContainerMostWater();
    }

    @Test
    public void maxArea() {
        int[] height = new int[] {1,8,6,2,5,4,8,3,7};
        assertEquals(49, cmw.maxAreaBruteForce(height));
    }
}