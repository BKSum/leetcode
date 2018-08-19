package bksum.leetcode.goog.ip;

public class RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B) {
        int counter = 1;
        StringBuilder sb = new StringBuilder(A);
        while(!isSubString(sb.toString(),B)){
            if(counter!=1 && sb.length() > (B.length() * 2)){
                return -1;
            }
            sb.append(A);
            counter++;
        }
        return counter;
    }

    public boolean isSubString(String fullString, String subString){
        return fullString.contains(subString);
    }
}
