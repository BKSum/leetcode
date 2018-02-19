/**
 * 
 */
package bksum.leetcode.fb.array;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author brand
 *
 */
public class IntersectArraysTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link bksum.leetcode.fb.array.IntersectArrays#intersect(int[], int[])}.
	 */
	@Test
	public void testIntersect() {
		IntersectArrays ia = new IntersectArrays();
		int[] nums1 = new int[] {1, 2, 2, 1};
		int[] nums2 = new int[] {2, 2};
		int[] expectedResults = new int[] {2, 2};
		assertArrayEquals(expectedResults, ia.intersect(nums1, nums2));
	}

	/**
	 * Test method for {@link bksum.leetcode.fb.array.IntersectArrays#intersect(int[], int[])}.
	 */
	@Test
	public void testIntersectRainy1() {
		IntersectArrays ia = new IntersectArrays();
		int[] nums1 = new int[] {1,2};
		int[] nums2 = new int[] {1,1};
		int[] expectedResults = new int[] {1};
		assertArrayEquals(expectedResults, ia.intersect(nums1, nums2));
	}
	
	/**
	 * Test method for {@link bksum.leetcode.fb.array.IntersectArrays#intersect(int[], int[])}.
	 */
	@Test
	public void testIntersectRainy2() {
		IntersectArrays ia = new IntersectArrays();
		int[] nums1 = new int[] {};
		int[] nums2 = new int[] {};
		int[] expectedResults = new int[] {};
		assertArrayEquals(expectedResults, ia.intersect(nums1, nums2));
	}
}
