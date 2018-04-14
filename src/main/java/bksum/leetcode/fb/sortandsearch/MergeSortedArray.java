package bksum.leetcode.fb.sortandsearch;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int total = m + n - 1;
        if(m==1 || m==0) return;

        for(int i=total; i>=0; i--){
            System.out.println(String.format("m(%s), n(%s)", m, n));
            if(m<1 || (n>=1 && nums1[m-1] < nums2[n-1])){
                nums1[i] = nums2[n-1];
                n--;
            }else{
                nums1[i] = nums1[m-1];
                m--;
            }
            System.out.println(Arrays.toString(nums1));

        }
    }

    public static void main(String[] args){
        /**

        int nums1[] = new int[4];
        nums1[0] = 1;
        nums1[1] = 4;
        nums1[2] = 6;
        int m = 3;
        int nums2[] = new int[]{5};
        int n = 1;

        int nums1[] = new int[]{0};
        int m = 0;
        int nums2[] = new int[]{1};
        int n = 1;
         *
         */
        int nums1[] = new int[6];
        nums1[0] = 4;
        nums1[1] = 5;
        nums1[2] = 6;
        nums1[3] = 0;
        nums1[4] = 0;
        nums1[5] = 0;
        int m = 3;
        int nums2[] = new int[3];
        nums2[0] = 1;
        nums2[1] = 2;
        nums2[2] = 3;
        int n = 3;

        new MergeSortedArray().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
