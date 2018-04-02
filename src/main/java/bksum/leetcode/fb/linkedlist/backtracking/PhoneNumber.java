package bksum.leetcode.fb.linkedlist.backtracking;

import java.util.*;

public class PhoneNumber {
	private final static String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
	public List<String> letterCombinations(String digits) {
		LinkedList<String> lc = new LinkedList<String>();
    	if(digits.isEmpty()) return lc;
    	lc.add("");
    	for(int i=0; i<digits.length(); i++) {
    		int x = Character.getNumericValue(digits.charAt(i));
    		while(lc.peekFirst().length() == i) {
	    		String t = lc.remove();
	    		for(char c : mapping[x].toCharArray()) {
	    			lc.add(t+c);
	    		}
    		}
    	}
		return lc;
        
    }
    
    public static void main(String args[]) {
    	PhoneNumber pn = new PhoneNumber();
    	System.out.println(pn.letterCombinations("23"));
    	
    }
}
