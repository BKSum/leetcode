/**
 * 
 */
package bksum.leetcode.fb.array;

import java.util.*;

/**
 * @author Brandon
 *
 */
public class ThreeSum {

	public List<List<Integer>> threeSumN3(int[] nums) {
		Arrays.sort(nums);
		List<Integer> positiveList = new ArrayList<Integer>();
		List<Integer> negativeList = new ArrayList<Integer>();
    	Set<List<Integer>> results = new HashSet<List<Integer>>();

		boolean containsZero = false;
		int zeroCounter = 0;
		for(int i: nums) {
			if(i<0) {
				negativeList.add(i);
			} else if(i>0) {
				positiveList.add(i);
			}else {
				containsZero=true;
				zeroCounter++;
			}
		}
		
		Collections.sort(negativeList);
		Collections.sort(positiveList);
		Collections.reverse(negativeList);

		int positiveListSize = positiveList.size();
		int negativeListSize = negativeList.size();
		
		if(zeroCounter>=3) {
			List<Integer> x = new ArrayList<Integer>(Arrays.asList(0,0,0));
			Collections.sort(x);
			results.add(x);
		}
		//if positiveList.size >2
		if(positiveListSize >= 2 && negativeListSize>= 1) {
			for(int i=0; i<positiveListSize-1; i++) {
				int negativeListCounter = 0;
				for(int j = i+1; j<positiveListSize; j++) {
					while(negativeListCounter < negativeListSize) {
						int positiveTwoSum = positiveList.get(i) + positiveList.get(j);
						int negativeNumer = Math.abs(negativeList.get(negativeListCounter));
						if(positiveTwoSum == negativeNumer) {
							List<Integer> x = new ArrayList<Integer>(Arrays.asList(positiveList.get(i), positiveList.get(j), negativeList.get(negativeListCounter)));
							Collections.sort(x);
							results.add(x);
							negativeListCounter++;
							break;
						}else if(positiveTwoSum < negativeNumer) {
							break;
						}else {
							negativeListCounter++;
						}
					}
				}
			}
		}
		
		//if negativeList > 2
		if(negativeListSize >= 2 && positiveListSize>= 1) {
			for(int i=0; i<negativeListSize-1; i++) {
				int positiveListCounter = 0;
				for(int j = i+1; j<negativeListSize; j++) {
					while(positiveListCounter < positiveListSize) {
						int negativeTwoSum = Math.abs(negativeList.get(i) + negativeList.get(j));
						int positiveNumer = positiveList.get(positiveListCounter);
						
						if(negativeTwoSum == positiveNumer) {
							List<Integer> x = new ArrayList<Integer>(Arrays.asList(negativeList.get(i), negativeList.get(j), positiveList.get(positiveListCounter)));
							Collections.sort(x);
							results.add(x);
							positiveListCounter++;
							break;
						}else if(negativeTwoSum < positiveNumer) {
							break;
						}else {
							positiveListCounter++;
						}
					}
				}
			}
		}
		
		//if containsZero
		if(containsZero && positiveListSize>0 && negativeListSize>0) {
			int negativeListCounter = 0;
			for(int i=0; i<positiveListSize; i++) {
				while(negativeListCounter < negativeListSize) {
					int positiveNumber = positiveList.get(i);
					int negativeNumer = Math.abs(negativeList.get(negativeListCounter));
					if(positiveNumber == negativeNumer) {
						List<Integer> x = new ArrayList<Integer>(Arrays.asList(0, positiveList.get(i), negativeList.get(negativeListCounter)));
						Collections.sort(x);
						results.add(x);
						negativeListCounter++;
						break;
					}else if(positiveNumber < negativeNumer) {
						break;
					}else {
						negativeListCounter++;
					}
				}
			}
		}
    	List<List<Integer>> resultSet = new ArrayList<List<Integer>>(results);
		return resultSet;   
    }
	
	public List<List<Integer>> threeSum(int[] num) {
	    Arrays.sort(num);
	    List<List<Integer>> res = new LinkedList<>(); 
	    for (int i = 0; i < num.length-2; i++) {
	        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
	            int lo = i+1, hi = num.length-1, sum = 0 - num[i];
	            while (lo < hi) {
	                if (num[lo] + num[hi] == sum) {
	                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
	                    while (lo < hi && num[lo] == num[lo+1]) lo++;
	                    while (lo < hi && num[hi] == num[hi-1]) hi--;
	                    lo++; hi--;
	                } else if (num[lo] + num[hi] < sum) lo++;
	                else hi--;
	           }
	        }
	    }
	    return res;
	}
}
