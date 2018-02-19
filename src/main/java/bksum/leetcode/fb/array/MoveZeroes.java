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

    public void moveZeroesOn3(int[] nums) {
        for(int i=0; i<nums.length; i++) {
    		for(int j=i;j<nums.length-1; j++) {
    			if(nums[i] == 0) {
    				for(int k=i;k<nums.length-1;k++) {
    					nums[k] = nums[k+1];
    				}
            		nums[nums.length-1] = 0;
    			}else {
    				break;
    			}
    		}
        }
    }
    
    public void moveZeroes(int[] nums) {
    	int arrayCounter = 0;

    	if(nums == null || nums.length == 0) { 
    		return;
    	}
    	
    	for(int pointer : nums) {
    		if(pointer != 0) {
    			nums[arrayCounter++] = pointer;
    		}
    	}
    	
    	for(int i = arrayCounter; i<nums.length; i++) {
    		nums[i] = 0;
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
