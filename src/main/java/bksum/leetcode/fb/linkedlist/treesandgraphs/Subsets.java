package bksum.leetcode.fb.linkedlist.treesandgraphs;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                System.out.println(nums[i] + "_" + nums[j]);
            }
        }
        return null;
    }

    public static void main(String args[]){
        System.out.println(new Subsets().subsets(new int[]{1,2,3}));
    }
}
