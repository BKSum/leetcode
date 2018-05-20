package bksum.leetcode.fb.array;

/**
 *
 */
public class MinimumSizeSubArray {

    /**
     * Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray
     *   of which the sum ≥ s. If there isn't one, return 0 instead.
     */
    public int minSubArrayLenBrute(int s, int[] nums) {
        //Input: [2,3,1,2,4,3], s = 7
        //Output: 2
        //Explanation: the subarray [4,3] has the minimal length under the problem constraint.
        //If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n).
        int minimumLength = -1;
        for(int i=0; i<nums.length; i++){
            int sumArray = nums[i];
            int counter = 1;
            if(sumArray >= s) return 1;

            for(int j=i+1; j<nums.length; j++){
                counter++;
                sumArray+=nums[j];
                if(sumArray >= s) {
                    minimumLength = minimumLength == -1 ? counter : Math.min(counter, minimumLength);
                    break;
                }
                if(minimumLength!=-1 && counter>=minimumLength) break;
            }
        }
        return minimumLength == -1 ? 0 : minimumLength;
    }

    public int minSubArrayLen(int s, int[] a) {
        if (a == null || a.length == 0)
            return 0;

        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

        while (j < a.length) {
            sum += a[j++];

            while (sum >= s) {
                min = Math.min(min, j - i);
                sum -= a[i++];
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
