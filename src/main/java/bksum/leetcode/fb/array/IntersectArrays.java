/**
 * 
 */
package bksum.leetcode.fb.array;

import java.util.*;

/**
 * @author Brandon
 *
 */
public class IntersectArrays {
	
	private int[] findCommon(int[] bigger, int[] smaller) {
		int counter = 0;
    	List<Integer> intersectList = new ArrayList<Integer>();

		for(int i=0; i<bigger.length; i++) {
			if(bigger[i]==smaller[counter]) {
				intersectList.add(bigger[i]);
				counter++;
			}else if(bigger[i]<smaller[counter]) {
				continue;
			}else{
				counter++;
				i -= 1;
			} 
			if(counter > smaller.length-1){
				break;
			}
		}
        int[] res = new int[intersectList.size()];
        for(int i = 0; i<res.length; i++){
            res[i] = intersectList.get(i);
        }
		return res;
	}
	
	/**
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
    public int[] intersect(int[] nums1, int[] nums2) {
    	if(nums1.length == 0 || nums2.length == 0) {
    		return (new int[0]);
    	}
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
		return findCommon(nums1, nums2);
    }
}
