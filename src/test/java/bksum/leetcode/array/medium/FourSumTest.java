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

    private static void sortList(List listToSort){
        listToSort.sort((Comparator<List<Integer>>) (o1, o2) -> {
            return o1.get(0).compareTo(o2.get(0));
        });
    }

    @Test
    public void fourSum() {
        int[] numArray = new int[] {1, 0, -1, 0, -2, 2};
        List<List<Integer>> expectedOutputList = new ArrayList<>();
        expectedOutputList.add(new ArrayList<>(Arrays.asList(-1, 0, 0, 1)));
        expectedOutputList.add(new ArrayList<>(Arrays.asList(-2, -1, 1, 2)));
        expectedOutputList.add(new ArrayList<>(Arrays.asList(-2, 0, 0, 2)));
        FourSumTest.sortList(expectedOutputList);
        List<List<Integer>> actualOutputList = fs.fourSum(numArray, 0);
        FourSumTest.sortList(actualOutputList);
        assertEquals(expectedOutputList, actualOutputList);
    }

    @Test
    public void fourSum_2() {
        int[] numArray = new int[] {-1,-5,-5,-3,2,5,0,4};
        List<List<Integer>> expectedOutputList = new ArrayList<>();
        expectedOutputList.add(new ArrayList<>(Arrays.asList(-5, -5, -1, 4)));
        expectedOutputList.add(new ArrayList<>(Arrays.asList(-5, -3, -1, 2)));
        FourSumTest.sortList(expectedOutputList);
        List<List<Integer>> actualOutputList = fs.fourSum(numArray, -7);
        FourSumTest.sortList(actualOutputList);
        assertEquals(expectedOutputList, actualOutputList);
    }
}