package bksum.leetcode.goog.array;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SpiralMatrixTest {

    private static SpiralMatrix sm;

    @Before
    public void setUp(){
        sm = new SpiralMatrix();
    }

    @Test
    public void spiralOrder1() {
        int[][] matrix = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}, };
        List<Integer> spiralList = sm.spiralOrder(matrix);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(6);
        expectedList.add(9);
        expectedList.add(8);
        expectedList.add(7);
        expectedList.add(4);
        expectedList.add(5);
        assertEquals(expectedList, spiralList);
    }

    @Test
    public void spiralOrder2() {
        int[][] matrix = new int[][] {{1,2}, {3,4}};
        List<Integer> spiralList = sm.spiralOrder(matrix);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(4);
        expectedList.add(3);
        assertEquals(expectedList, spiralList);
    }

    @Test
    public void spiralOrder3() {
        int[][] matrix = new int[][] {{1}};
        List<Integer> spiralList = sm.spiralOrder(matrix);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        assertEquals(expectedList, spiralList);
    }

    @Test
    public void spiralOrder4() {
        int[][] matrix = new int[][] {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, };
        List<Integer> spiralList = sm.spiralOrder(matrix);
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(4);
        expectedList.add(8);
        expectedList.add(12);
        expectedList.add(11);
        expectedList.add(10);
        expectedList.add(9);
        expectedList.add(5);
        expectedList.add(6);
        expectedList.add(7);
        assertEquals(expectedList, spiralList);
    }
}