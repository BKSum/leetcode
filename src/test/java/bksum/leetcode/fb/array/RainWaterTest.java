package bksum.leetcode.fb.array;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RainWaterTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTrap() {
		RainWater rw = new RainWater();
		int[] elevationMap = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
		int results = rw.trap(elevationMap);
		assertEquals(6, results);
	}

}
