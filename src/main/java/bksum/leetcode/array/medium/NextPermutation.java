package bksum.leetcode.array.medium;

import java.util.Arrays;

class NextPermutation {

    private int findNextBiggestPosition(int startPoint, int[] nums){
        int currentNumber = nums[startPoint];
        int nextLeastBiggestNumber = Integer.MAX_VALUE;
        int nextLeastBiggestNumberDIFF = Integer.MAX_VALUE;
        int position = -1;
        for(int i = startPoint+1; i<nums.length; i++){
            if(nums[i] > currentNumber
                    && (nextLeastBiggestNumber-nums[i]) < nextLeastBiggestNumberDIFF){
                nextLeastBiggestNumber = nums[i];
                position = i;
            }
        }
        return position;
    }

    private boolean updateNextBiggest(int startPoint, int[] nums){
        int positionOfNextBiggest = findNextBiggestPosition(startPoint, nums);
        if(positionOfNextBiggest==-1){
            return false;
        }
        int tempInt = nums[startPoint];
        nums[startPoint] = nums[positionOfNextBiggest];
        nums[positionOfNextBiggest] = tempInt;
        return true;
    }

    void nextPermutation(int[] nums) {
        int firstPositionReplaced = -1;
        for(int i=nums.length-1; i>=0; i--) {
            if(updateNextBiggest(i, nums)) {
                firstPositionReplaced = i;
                break;
            }
        }
        Arrays.sort(nums, firstPositionReplaced+1, nums.length);
    }
}
