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
        assertEquals(3, rsm.repeatedStringMatch(strA, strB));
    }

}