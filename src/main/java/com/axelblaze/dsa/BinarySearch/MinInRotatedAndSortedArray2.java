package com.axelblaze.dsa.BinarySearch;

public class MinInRotatedAndSortedArray2 {

    /*

    Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:

    [4,5,6,7,0,1,4] if it was rotated 4 times.
    [0,1,4,4,5,6,7] if it was rotated 7 times.
    Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

    Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.

    You must decrease the overall operation steps as much as possible.
     */

    public int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (nums[mi] > nums[hi]) {
                lo = mi + 1;
            }
            else if (nums[mi] < nums[lo]) {
                hi = mi;
                lo++;
            }
            else { // nums[lo] <= nums[mi] <= nums[hi]
                hi--;
            }
        }

        return nums[lo];


        // int min = Integer.MAX_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     min = Math.min(min, nums[i]);
        // }
        // return min;
    }
}
