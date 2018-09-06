package bksum.leetcode.fb.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MinimumSizeSubArraySum {
    /**
     *
     * @param s
     * @param nums
     * @return
     */
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        reverse(nums);
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            if(sum >= s){
                return i+1;
            }
        }
        return 0;
    }

    private static void reverse(int[] input) {
        int last = input.length - 1;
        int middle = input.length / 2;
        for (int i = 0; i <= middle; i++) {
            int temp = input[i];
            input[i] = input[last - i];
            input[last - i] = temp;
        }
    }
}
