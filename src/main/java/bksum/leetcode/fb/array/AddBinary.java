/**
 * 
 */
package bksum.leetcode.fb.array;

/**
 * @author Brandon
 *
 */
public class AddBinary {

    public String addBinary(String a, String b) {
    	int evalA, evalB, evalCarry = 0, evalExpression = 0;
    	int aLength = a.length() - 1;
    	int bLength = b.length() - 1;
    	
    	StringBuilder result = new StringBuilder();
    	while(aLength>=0 || bLength>=0 || evalCarry>0) {
    		evalA = (aLength>=0) ? Character.getNumericValue(a.charAt(aLength--)) : 0;
    		evalB = (bLength>=0) ? Character.getNumericValue(b.charAt(bLength--)) : 0;
    		evalExpression = evalA ^ evalB ^ evalCarry;
    		evalCarry = (evalA + evalB + evalCarry) >= 2 ? 1 : 0;
    		result.append(evalExpression);
    	}
		return result.reverse().toString();
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
		AddBinary ab = new AddBinary();
		System.out.println(ab.addBinary("11", "1"));
	}

}
