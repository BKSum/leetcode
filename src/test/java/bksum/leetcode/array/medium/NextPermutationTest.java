package bksum.leetcode.array.medium;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextPermutationTest {

    private NextPermutation np;

    @Before
    public void setUp(){
        np = new NextPermutation();
    }

    @Test
    public void nextPermutation_Test1() {
        int[] input = new int[] {1,2,3};
        int[] expectedPermutation = new int[] {1,3,2};
        np.nextPermutation(input);
        assertArrayEquals(expectedPermutation, input);
    }

    @Test
    public void nextPermutation_Test2() {
        int[] input = new int[] {1,1,5};
        int[] expectedPermutation = new int[] {1,5,1};
        np.nextPermutation(input);
        assertArrayEquals(expectedPermutation, input);
    }

    @Test
    public void nextPermutation_Test3() {
        int[] input = {3,2,1};
        int[] expectedPermutation = new int[] {1,2,3};
        np.nextPermutation(input);
        assertArrayEquals(expectedPermutation, input);
    }

    @Test
    public void nextPermutation_Test4() {
        int[] input = {1,3,2};
        int[] expectedPermutation = new int[] {2,1,3};
        np.nextPermutation(input);
        assertArrayEquals(expectedPermutation, input);
    }
}