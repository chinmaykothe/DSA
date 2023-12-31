package com.axelblaze.recursion.Recursion;

import java.util.*;
public class Combinations {
    public void helper(int i, int k, int[] arr, ArrayList<Integer> list, List<List<Integer>> ans) {
        if(list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(i>=arr.length) return;

        list.add(arr[i]);
        helper(i+1, k, arr, list, ans);

        list.remove(list.size()-1);
        helper(i+1, k, arr, list, ans);
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = i+1;

        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        helper(0, k, arr, list, ans);
        return ans;
    }
}
