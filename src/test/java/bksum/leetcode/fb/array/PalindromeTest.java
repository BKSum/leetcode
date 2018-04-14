package bksum.leetcode.fb.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    private Palindrome palindrome;
    @Before
    public void setUp(){
        palindrome = new Palindrome();
    }

    @Test
    public void isPalindrome() {
        boolean results = palindrome.isPalindrome("A man, a plan, a canal: Panama");
        assertTrue(results);
    }

    @Test
    public void isPalindromeBlank() {
        boolean results = palindrome.isPalindrome("");
        assertTrue(results);
    }

}