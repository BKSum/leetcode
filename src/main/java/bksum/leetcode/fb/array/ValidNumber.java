package bksum.leetcode.fb.array;

/**
 *
 */
public class ValidNumber {

    /**
     *
     * @param s String that you want tested
     * @return true is string is a number
     */
    public boolean isNumber(String s) {
        s = s.trim();
        if(s.length() == 0) return false;
        boolean hasDecimal = false;
        boolean hasE = false;
        boolean atLeastOneInteger = false;
        boolean numberBeforeE = false;
        boolean numberAfterE = false;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '.'){
                if(hasDecimal) return false;
                if(s.length() == 1) return false;
                if(hasE) return false;
                hasDecimal = true;
            }else if (c=='e'){
                if(hasE) return false;
                if(i == 0) return false;
                if(i == s.length()-1) return false;
                if(!numberBeforeE) return false;
                if(!Character.isDigit(s.charAt(i+1)) && s.charAt(i+1) != '+' && s.charAt(i+1) != '-') return false;
                hasE = true;
            }else if(c=='-' || c=='+'){
                if(i==0) continue;
                if(s.charAt(i-1) == 'e') continue;
                return false;
            }else if(!Character.isDigit(c)){
                return false;
            }else{
                atLeastOneInteger = true;
                numberBeforeE = !hasE;
                numberAfterE = hasE;
            }
        }
        if(hasE && !numberAfterE) return false;
        return atLeastOneInteger;
    }
}
