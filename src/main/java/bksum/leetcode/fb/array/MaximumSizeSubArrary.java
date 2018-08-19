package bksum.leetcode.fb.array;

public class MaximumSizeSubArrary {

    /**
     * Given an array nums and a target value k, find the maximum length of a subarray that sums to k.
     *   If there isn't one, return 0 instead.
     */
    public int maxSubArrayLen(int[] nums, int k) {
//        Input: nums = [1, -1, 5, -2, 3], k = 3
//        Output: 4
        int maxLength = 0;

        for(int i=0; i<nums.length; i++){
            int sum = 0;
            for(int j=i; j<nums.length; j++){
                sum+=nums[j];
                if(sum == k){
                    maxLength = Math.max(maxLength, j+1-i);
                }
            }
        }
        return maxLength;
    }
}
