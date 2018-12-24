package bksum.leetcode.goog.ip;

import java.util.HashSet;
import java.util.Set;

public class RepeatedStringMatch {

    public int repeatedStringMatch(String A, String B) {
        Set<Character> setA = new HashSet<>();
        Set<Character> setB = new HashSet<>();
        for(int i=0; i<A.length(); i++){
            setA.add(A.charAt(i));
        }
        for(int i=0; i<B.length(); i++){
            setB.add(B.charAt(i));
        }
        if(!setA.containsAll(setB))
            return -1;

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

    public int repeatedStringMatchX(String A, String B) {
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
