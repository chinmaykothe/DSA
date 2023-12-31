package com.axelblaze.recursion.Recursion;

import java.util.*;
public class Permutations2 {
    public void helper(int pos, ArrayList<Integer> arr, HashSet<ArrayList<Integer>> set) {
        if(pos>=arr.size()) {
            set.add(new ArrayList<>(arr));
            return;
        }

        for(int i=pos; i<arr.size(); i++) {
            Collections.swap(arr, pos, i);
            helper(pos+1, arr, set);
            Collections.swap(arr, pos, i);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++) list.add(nums[i]);

        helper(0, list, set);

        for(ArrayList<Integer> data : set) {
            ans.add(data);
        }
        return ans;
    }
}
