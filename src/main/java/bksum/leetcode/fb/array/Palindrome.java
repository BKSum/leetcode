package bksum.leetcode.fb.array;

public class Palindrome {
    private static final boolean DEBUG = true;

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if(s.length()<=1){ return true; }
        int left = 0;
        int right = s.length() -1;

        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                System.out.println("SkipLeft: " + s.charAt(left));
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                System.out.println("SkipRight: " + s.charAt(right));
                right--;
                continue;
            }
            if(s.charAt(left) != s.charAt(right)){
                System.out.println(String.format("LeftAndRight not matching.  Left(%s) Right(%s)", s.charAt(left), s.charAt(right)));
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println("\n\n********** Started Palindrome **********");
        String input = "A man, a plan, a canal: Panama";
        Palindrome p = new Palindrome();
        System.out.println("Is \"" + input + "\" a palindrome: " + p.isPalindrome(input.toLowerCase()));
    }
}
