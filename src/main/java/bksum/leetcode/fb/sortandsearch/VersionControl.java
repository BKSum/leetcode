package bksum.leetcode.fb.sortandsearch;

public class VersionControl {

	boolean isBadVersion(int version) {
		if(version >=1702766719) return true;
		return false;
	};
	
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;    
        while(low<high) {
            //int mid = low + (high - low) / 2;
            int mid = (low+high) / 2;
        	if(isBadVersion(mid)) {
        		high = mid;
        	}else {
        		low = mid+1;
        	}
        }
        return low;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int one = 2126653390;
		int two = 2126753390;
		System.out.println((two+two)/2);
		System.out.println(one+ ((two-one)/2));
		
		VersionControl vc = new VersionControl();
		System.out.println(vc.firstBadVersion(2126753390));
	}

}
