package bksum.leetcode.array.medium;

/**
 * Problem #11
 */
class ContainerMostWater {

    /**
     * O(n) solution
     * @param height primitive array list of container heights
     * @return max area that water can be filled
     */
    int maxArea(int[] height) {
        int maxArea = 0, left = 0;
        int right = height.length-1;
        while(left<right){
            maxArea = Math.max(maxArea, Math.min(height[left],height[right])*(right-left));
            if(height[left] < height[right]) left++;
            else right--;
        }
        return maxArea;
    }

    /**
     * Brute force solution - 231 ms
     * @param height primitive array list of container heights
     * @return max area that water can be filled
     */
    int maxAreaBruteForce(int[] height) {
        int maxArea = 0;
        for(int i=0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                int length = j-i;
                int depth = Math.min(height[i], height[j]);
                maxArea = Math.max(maxArea, length*depth);
            }
        }
        return maxArea;
    }
}
