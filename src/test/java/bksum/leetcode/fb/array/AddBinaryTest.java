package bksum.leetcode.fb.array;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AddBinaryTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAddBinary() {
		AddBinary ab = new AddBinary();
		String results = ab.addBinary("11", "1");
		assertEquals("100", results);
	}
}
