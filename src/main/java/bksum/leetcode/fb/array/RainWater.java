/**
 * 
 */
package bksum.leetcode.fb.array;

/**
 * @author Brandon
 *
 */
public class RainWater {
    public int trap(int[] height) {
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
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
		int[] elevationMapa = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
		int[] elevationMap = new int[] {0,1,0,2,1,0,1,3};

		RainWater ab = new RainWater();
		System.out.println(ab.trap(elevationMapa));
	}

}
