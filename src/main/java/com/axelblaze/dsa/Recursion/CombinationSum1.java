package com.axelblaze.recursion.Recursion;

import java.util.*;
public class CombinationSum1 {
    public void helper(int i, int[] arr, int target, List<List<Integer>> ans, List<Integer> list) {
        if(i==arr.length || target < 0)
            return;
        if(target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
        target -= arr[i];
        helper(i, arr, target, ans, list);

        list.remove(list.size()-1);
        target += arr[i];
        helper(i+1, arr, target, ans, list);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(0, candidates, target, ans, list);
        return ans;
    }
}
