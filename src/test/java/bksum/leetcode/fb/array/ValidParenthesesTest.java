package bksum.leetcode.fb.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    private ValidParentheses vp;

    @Before
    public void setUp() {
        vp = new ValidParentheses();
    }

    @Test
    public void isValid1() {
        assertTrue(vp.isValid("()"));
    }

    @Test
    public void isValid2() {
        assertTrue(vp.isValid("()[]{}"));
    }

    @Test
    public void isValid3() {
        assertFalse(vp.isValid("(]"));
    }

    @Test
    public void isValid4() {
        assertFalse(vp.isValid("([)]"));
    }

    @Test
    public void isValid5() {
        assertTrue(vp.isValid("{[]}"));
    }

    @Test
    public void isValid6() {
        assertFalse(vp.isValid("]"));
    }

    @Test
    public void isValid7() {
        assertFalse(vp.isValid("["));
    }
}