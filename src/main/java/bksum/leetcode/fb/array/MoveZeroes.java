/**
 * 
 */
package bksum.leetcode.fb.array;

import java.util.*;

/**
 * @author Brandon
 *
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
    	//0 0 1
    	//0 1 0
    	//0 
        for(int i=0; i<nums.length; i++) {
        	if(nums[i] == 0) {
        		for(int j=i;j<nums.length-1; j++) {
        			nums[j] = nums[j+1];
        		}
        		nums[nums.length-1] = 0;
        		break;
        	}
        }
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
		int[] numArray = new int[] {0, 0, 1};

		MoveZeroes mz = new MoveZeroes();
		mz.moveZeroes(numArray);
		System.out.println(Arrays.toString(numArray));
	}

}
