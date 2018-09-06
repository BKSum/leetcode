package bksum.leetcode.goog.ip;

public class RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder(A);
        int counter = 1;
        while(sb.length()<B.length()){
            sb.append(A);
            counter++;
        }
        if(sb.toString().contains(B)) return counter;
        if(sb.append(A).toString().contains(B)) return counter+1;
        return -1;
    }
}
