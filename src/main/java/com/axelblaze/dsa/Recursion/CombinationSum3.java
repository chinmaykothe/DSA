package com.axelblaze.dsa.Recursion;

import java.util.*;
public class CombinationSum3 {

    public void helper(int i, int k, int target, int[] nums, List<Integer> list, List<List<Integer>> ans) {

        if(k == 0 && target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        //if(k<0) return;
        if(i>=nums.length) return;

        list.add(nums[i]);
        target -= nums[i];
        helper(i+1, k-1, target, nums, list, ans);

        list.remove(list.size()-1);
        target += nums[i];
        helper(i+1, k, target, nums, list, ans);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int arr[] = new int[9];
        for(int i=0; i<9; i++) arr[i] = i+1;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        helper(0, k, n, arr, list, ans);
        return ans;
    }
}
