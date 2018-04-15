package bksum.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerToEnglishTest {

    @Test
    public void numberToWordsSingleDigit() {
        IntegerToEnglish ite = new IntegerToEnglish();
        String results = ite.numberToWords(5);
        assertEquals("Input was 5", "Five", results);
    }

    @Test
    public void numberToWordsBelowTeens() {
        IntegerToEnglish ite = new IntegerToEnglish();
        String results = ite.numberToWords(15);
        assertEquals("Input was 15", "Fifteen", results);
    }

    @Test
    public void numberToWordsTens() {
        IntegerToEnglish ite = new IntegerToEnglish();
        String results = ite.numberToWords(23);
        assertEquals("Input was 23", "Twenty Three", results);
    }

    @Test
    public void numberToWordsHundreds() {
        IntegerToEnglish ite = new IntegerToEnglish();
        String results = ite.numberToWords(123);
        assertEquals("Input was 123", "One Hundred Twenty Three", results);
    }

    @Test
    public void numberToWordsHundred() {
        IntegerToEnglish ite = new IntegerToEnglish();
        String results = ite.numberToWords(100);
        assertEquals("Input was 100", "One Hundred", results);
    }

    @Test
    public void numberToWordsThousands() {
        IntegerToEnglish ite = new IntegerToEnglish();
        String results = ite.numberToWords(12345);
        assertEquals("Input was 12345", "Twelve Thousand Three Hundred Forty Five", results);
    }

    @Test
    public void numberToWordsMillions() {
        IntegerToEnglish ite = new IntegerToEnglish();
        String results = ite.numberToWords(1234567);
        assertEquals("Input was 1234567", "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", results);
    }
}