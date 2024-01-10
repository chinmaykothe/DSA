package com.axelblaze.dsa.BinarySearch;

public class PeakElement {

    public int findPeakElement(int[] nums) {
        //Edge cases
        // if length == 1
        if(nums.length==1)
            return 0;

        //check first element
        if(nums[0]>nums[1])
            return 0;

        // check last element
        if(nums[nums.length-2]<nums[nums.length-1])
            return nums.length-1;

        // perform Binary Search
        int s=1, e=nums.length-2;
        while(s<=e) {
            int mid = s+(e-s)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
                return mid;
            else if(nums[mid]<nums[mid+1])
                s=mid+1;
            else
                e=mid-1;
        }
        return -1;
    }
}
