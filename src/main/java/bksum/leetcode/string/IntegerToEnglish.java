package bksum.leetcode.string;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

class IntegerToEnglish {

    private final String[] LESS_THAN_TWENTY = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    private String numberToWordsHundredsHelper(int num){
        if(num == 0)
            return "";
        else if(num<20){
            return LESS_THAN_TWENTY[num];
        }else if(num<100){
            return TENS[num/10] + " " + numberToWordsHundredsHelper(num%10);
        }else{
            return(LESS_THAN_TWENTY[num/100] + " Hundred " + numberToWordsHundredsHelper(num%100));
        }
    }

    protected String numberToWords(int num) {
        long startTime = System.currentTimeMillis();

        if(num == 0)
            return "Zero";

        String words = "";
        int i = 0;
        while(num>0){
            if(num%1000!=0){
                words = numberToWordsHundredsHelper(num%1000).trim() + " " + THOUSANDS[i] + " " + words;
            }
            num/=1000;
            i++;
        }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("stopTime: " + stopTime);
        System.out.println("startTime: " + startTime);
        System.out.println("elapsedTime: " + elapsedTime);
        return(words.trim());
    }
}
