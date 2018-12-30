package bksum.leetcode.array.medium;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class FourSumTest {

    private FourSum fs;
    @Before
    public void setUp(){
        fs = new FourSum();
    }

    @Test
    public void fourSum() {
        int[] numArray = new int[] {1, 0, -1, 0, -2, 2};
        List<List<Integer>> expextedOutput = new ArrayList<>();
        expextedOutput.add(new ArrayList<>(Arrays.asList(-1, 0, 0, 1)));
        expextedOutput.add(new ArrayList<>(Arrays.asList(-2, -1, 1, 2)));
        expextedOutput.add(new ArrayList<>(Arrays.asList(-2, 0, 0, 2)));

        assertEquals(expextedOutput.sort(Comparator.naturalOrder()), fs.fourSum(numArray, 0));
    }
}