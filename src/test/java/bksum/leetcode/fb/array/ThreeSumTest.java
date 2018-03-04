package bksum.leetcode.fb.array;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class ThreeSumTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testThreeSum() {
		ThreeSum ts = new ThreeSum();
		int[] arrayS = new int[] {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(-1);
		l1.add(0);
		l1.add(1);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(-1);
		l2.add(-1);
		l2.add(2);
		expectedAnswer.add(l2);
		expectedAnswer.add(l1);
		assertEquals(expectedAnswer, ts.threeSum(arrayS));
	}
	
	@Test
	public void testThreeSumT1() {
		ThreeSum ts = new ThreeSum();
		int[] arrayS = new int[] {-1, 0, 1, 2, -1, -4};
		List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(-1);
		l1.add(0);
		l1.add(1);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(-1);
		l2.add(-1);
		l2.add(2);
		expectedAnswer.add(l2);
		expectedAnswer.add(l1);
		assertEquals(expectedAnswer, ts.threeSum(arrayS));
	}	
	
	@Test
	public void testThreeSumT2() {
		ThreeSum ts = new ThreeSum();
		int[] arrayS = new int[] {-2, 0, 1, 2, 1, -4};
		List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(-2);
		l1.add(0);
		l1.add(2);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(-2);
		l2.add(1);
		l2.add(1);
		expectedAnswer.add(l1);
		expectedAnswer.add(l2);
		assertEquals(expectedAnswer, ts.threeSum(arrayS));
	}	

	@Test
	public void testThreeSumT3() {
		ThreeSum ts = new ThreeSum();
		int[] arrayS = new int[] {1,1,-2};
		List<List<Integer>> expectedAnswer = new ArrayList<List<Integer>>();
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(-2);
		l1.add(1);
		l1.add(1);
		expectedAnswer.add(l1);
		assertEquals(expectedAnswer, ts.threeSum(arrayS));
	}	
}
