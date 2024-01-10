package com.axelblaze.dsa.BinarySearch;

import java.util.Arrays;

public class FindFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int[] pos = new int[2];
        Arrays.fill(pos, -1);

        // find first position
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target){
                pos[0] = mid;
                e = mid - 1;
            }
            else if (nums[mid] < target){
                s = mid+1;
            }
            else{
                e = mid - 1;
            }
        }

        // find last position

        s = 0;
        e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target){
                pos[1] = mid;
                s = mid+1;
            }
            else if(nums[mid] < target){
                s = mid+1;
            }
            else {
                e = mid-1;
            }
        }
        return pos;
    }
}
