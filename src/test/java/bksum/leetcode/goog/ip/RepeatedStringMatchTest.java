package bksum.leetcode.goog.ip;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedStringMatchTest {

    private RepeatedStringMatch rsm;

    @Before
    public void setUp() throws Exception {
        rsm = new RepeatedStringMatch();
    }

    @Test
    public void repeatedStringMatch() {
        String strA = "abcd";
        String strB = "cdabcdab";
        assertEquals(rsm.repeatedStringMatch(strA, strB), 3);
    }

    @Test
    public void isSubString1() {
        String strA = "abcd";
        String strB = "cdabcdab";
        assertFalse(rsm.isSubString(strA, strB));
    }

    @Test
    public void isSubString2() {
        String strA = "abcdabcdabcd";
        String strB = "cdabcdab";
        assertTrue(rsm.isSubString(strA, strB));
    }

}