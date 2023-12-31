package com.axelblaze.recursion.Recursion;

import java.util.*;

public class Permutations {
    public void helper(int pos, ArrayList<Integer> nums, List<List<Integer>> ans) {
        if(pos>=nums.size()) {
            ans.add(new ArrayList<>(nums));
            return;
        }

        for(int i=pos; i<nums.size(); i++) {
            Collections.swap(nums, pos, i);
            helper(pos+1, nums, ans);
            Collections.swap(nums, pos, i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++) list.add(nums[i]);
        helper(0, list, ans);
        return ans;
    }
}
