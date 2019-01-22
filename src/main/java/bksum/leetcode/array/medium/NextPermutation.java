package bksum.leetcode.array.medium;

import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {

    private void reverseArray(int[] intArray){
        int[] revArray = new int[intArray.length];
        for(int i=0; i<intArray.length; i++){

        }
    }
    public void nextPermutation(int[] nums) {
        for(int i=nums.length-1; i>0; i--){
            if(nums[i] > nums[i-1]){
                int tempInt = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = tempInt;
                return;
            }
        }
        Arrays.sort(nums);

    }
}
