package com.axelblaze.recursion.Recursion;

import java.util.*;
public class Subsets {
    public void helper(int[] nums, int i, List<Integer> list, List<List<Integer>> ans) {
        if(i==nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        helper(nums, i+1, list, ans);

        list.remove(list.size()-1);
        helper(nums, i+1, list, ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(nums, 0, list, ans);
        return ans;
    }
}
