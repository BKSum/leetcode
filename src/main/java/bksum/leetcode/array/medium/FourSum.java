package bksum.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem #18
 */
class FourSum {

    /**
     * Runtime: 35 ms, faster than 79.48% of Java online submissions for 4Sum.
     * @param nums
     * @param target
     * @return
     */
    List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> returnList = new ArrayList<>();

        int tempFirstNum = 0;
        boolean checkTempFirstNumInitialized = false;

        for(int i=0; i<nums.length; i++){
            if(checkTempFirstNumInitialized && tempFirstNum == nums[i])
                continue;
            else {
                checkTempFirstNumInitialized = true;
                tempFirstNum = nums[i];
            }
            int tempSecondaryNum = 0;
            boolean checkTempSecondaryNumInitialized = false;
            for(int j=i+1; j<nums.length; j++){
                if(checkTempSecondaryNumInitialized && tempSecondaryNum == nums[j])
                    continue;
                else {
                    checkTempSecondaryNumInitialized = true;
                    tempSecondaryNum = nums[j];
                }
                int left = j+1;
                int right= nums.length-1;
                int tempTargetSum = target - (nums[i] + nums[j]);

                while(left<right){
                    if(tempTargetSum > nums[left] + nums[right]){
                        left++;
                    }else if(tempTargetSum < nums[left] + nums[right]){
                        right--;
                    }else{
                        int numLeft = nums[left];
                        int numRight = nums[right];
                        returnList.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left],numRight)));
                        left++;
                        right--;
                        while(left<right && numLeft==nums[left]) left++;
                        while(left<right && numRight==nums[right]) right--;
                    }
                }
            }
        }
        return returnList;
    }
}
