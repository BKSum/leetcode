package bksum.leetcode.fb.array;

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

    @Test
    public void isNumberTest5() {
        assertFalse(vn.isNumber("0e"));
    }

    @Test
    public void isNumberTest6() {
        assertFalse(vn.isNumber(".e1"));
    }

    @Test
    public void isNumberTest7() {
        assertFalse(vn.isNumber("1e."));
    }

    @Test
    public void isNumberTest8() {
        assertTrue(vn.isNumber("-1."));
    }

    @Test
    public void isNumberTest9() {
        assertFalse(vn.isNumber("-."));
    }

    @Test
    public void isNumberTest10() {
        assertTrue(vn.isNumber("46.e3"));
    }

    @Test
    public void isNumberTest11() {
        assertFalse(vn.isNumber("6e6.5"));
    }

    @Test
    public void isNumberTest12() {
        assertTrue(vn.isNumber(" 005047e+6"));
    }

    @Test
    public void isNumberTest13() {
        assertFalse(vn.isNumber("4e+"));
    }
}