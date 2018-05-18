package bksum.leetcode.fb.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidNumberTest {

    private ValidNumber vn;

    @Before
    public void setUp() {
        vn = new ValidNumber();
    }

    @Test
    public void isNumberZero() {
        assertTrue(vn.isNumber("0"));
    }

    @Test
    public void isNumberTest1() {
        assertTrue(vn.isNumber(" 0.1 "));
    }

    @Test
    public void isNumberTest2() {
        assertFalse(vn.isNumber("abc"));
    }

    @Test
    public void isNumberTest3() {
        assertFalse(vn.isNumber("1 a"));
    }

    @Test
    public void isNumberTest4() {
        assertTrue(vn.isNumber("2e10"));
    }
}