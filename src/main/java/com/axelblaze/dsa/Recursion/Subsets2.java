package com.axelblaze.recursion.Recursion;

import java.util.*;
public class Subsets2 {
    public void helper(int[] nums, int i, List<Integer> list,  HashSet<List<Integer>> set) {
        if(i>=nums.length) {
            set.add(new ArrayList<>(list));
            return;
        }

        helper(nums, i+1, list, set);
        list.add(nums[i]);

        helper(nums, i+1, list, set);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, 0, list, set);
        for(List<Integer> item : set) {
            ans.add(item);
        }
        return ans;
    }
}
