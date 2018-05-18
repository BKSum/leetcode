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
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '.'){
                if(hasDecimal) return false;
                if(s.length() == 1) return false;
                hasDecimal = true;
            }else if (c=='e'){
                if(hasE) return false;
                if(i == 0) return false;
                hasE = true;
            }else if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

//    @SuppressWarnings("all")
//    public boolean isNumberRegex(String s) {
//        s = s.trim();
//        if(s.isEmpty())
//            return false;
//        return s.trim().matches("[+-]?[0-9]*((?<=[0-9])\\.||\\.(?=[0-9]))?[0-9]*((?<=[0-9.])(e[+-]?[0-9]+))?");
//    }
}
