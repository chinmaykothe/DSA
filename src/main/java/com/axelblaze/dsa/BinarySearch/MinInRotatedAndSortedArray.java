package com.axelblaze.dsa.BinarySearch;

public class MinInRotatedAndSortedArray {

    /*
    Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

    [4,5,6,7,0,1,2] if it was rotated 4 times.
    [0,1,2,4,5,6,7] if it was rotated 7 times.
    Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

    Given the sorted rotated array nums of unique elements, return the minimum element of this array.

    You must write an algorithm that runs in O(log n) time.

     */


    public int findMin(int[] nums) {
        int pivot = -1;
        int s= 0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]>=nums[0])
                s=mid+1;
            else{
                pivot = nums[mid];
                e=mid-1;
            }
        }
        if(pivot==-1)
            return nums[0];
        return pivot;
    }
}
