package com.axelblaze.dsa.BinarySearch;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int ans = -1;

        int s=0, e=nums.length-1;
        while(s<=e) {
            int mid = s+(e-s)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target) {
                ans = mid;
                s=mid+1;
            }
            else if(target<nums[mid])
                e=mid-1;
        }
        return ans+1;
    }
}
