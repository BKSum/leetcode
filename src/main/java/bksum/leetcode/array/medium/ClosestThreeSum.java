package bksum.leetcode.array.medium;

import java.util.Arrays;

class ClosestThreeSum {

    /**
     * O(N*N) Solution
     * @param nums array of integers
     * @param target target sum
     * @return closest sum to target
     */
    int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = 0;
        int closestSumDiff=Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            int tempTarget = target - nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int tempSum = nums[i]+nums[left]+nums[right];
                if(Math.min(Math.abs(tempSum-target), closestSumDiff) != closestSumDiff){
                    closestSumDiff = Math.abs(tempSum-target);
                    closestSum = tempSum;
                }
                if(tempTarget < (nums[left]+nums[right])){
                    right--;
                }else if(tempTarget > (nums[left]+nums[right])){
                    left++;
                }else{
                    return tempSum;
                }
            }
        }
        return closestSum;
    }

    /**
     * Brute force 159ms.
     * @param nums array of integers
     * @param target target sum
     * @return closest sum to target
     */
    int threeSumClosestBrute(int[] nums, int target) {
        int closestSum = 0;
        int closestSumDiff = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                for(int k=j+1; k<nums.length; k++){
                    int tempSum = nums[i]+nums[j]+nums[k];
                    if(Math.min(Math.abs(tempSum-target), closestSumDiff) != closestSumDiff){
                        closestSumDiff = Math.abs(tempSum-target);
                        closestSum = tempSum;
                    }
                }
            }
        }
        return closestSum;
    }
}
