/**
 * 
 */
package bksum.leetcode.fb.array;

/**
 * @author Brandon
 *
 */
public class RainWater {
	
    public int trapN2(int[] height) {
    	int waterAmount = 0;
    	for(int i = 1; i< height.length-1; i++) {
        	int maxLeft = 0;
        	int maxRight = 0;    		
    		//search max left
    		for(int j = i; j>=0; j--) {
    			maxLeft = Math.max(maxLeft, height[j]);
    		}
    		//search max right
    		for(int k = i; k<height.length; k++) {
    			maxRight = Math.max(maxRight, height[k]);
    		}
    		//water amount here is
    		waterAmount = waterAmount + Math.min(maxLeft, maxRight) - height[i];
    	}
		return waterAmount;
    }
    
    public int trap(int[] height) {
    	int heightSize = height.length;
    	int[] leftMost = new int[heightSize];
    	int[] rightMost = new int[heightSize];
    	int answer = 0;
    	
    	for(int i=0; i<heightSize; i++) {
    		leftMost[i] = (i==0) ? height[i] : Math.max(leftMost[i-1], height[i]);
    	}
    	
    	for(int i=heightSize-1; i>=0; i--) {
    		rightMost[i] = (heightSize-1==i) ? height[i] : Math.max(rightMost[i+1], height[i]);
    	}
    	
    	for(int i=0; i<heightSize; i++) {
    		answer += Math.min(leftMost[i], rightMost[i]) - height[i];
    	}
    	
		return answer;
    }
    
    
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
		int[] elevationMap = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};

		RainWater ab = new RainWater();
		System.out.println(ab.trap(elevationMap));
	}

}
