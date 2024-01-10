package com.axelblaze.dsa.BinarySearch;

public class SearchInRotatedAndSortedArray2 {
    public boolean search(int[] nums, int target) {
         int pivot = searchPivot(nums, target);
         if(pivot != -1 && nums[pivot] == target)
             return true;
         if(pivot == -1){
             if(searchTarget(nums, 0, nums.length-1, target) >-1)
                 return true;
         }
         if(target >= nums[0]){
             if(searchTarget(nums, 0, nums.length-1, target) >-1)
                 return true;
         }
         else{
             if(searchTarget(nums, 0, nums.length-1, target) >-1)
                 return true;
         }
         return false;
    }
    public int searchTarget(int[] A, int l, int r, int target){
        int ans = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(A[mid] == target)
                return mid;
            else if(A[mid] > target){
                //ans = mid;
                r = mid - 1;
            }
            else{
                //ans = mid;
                l = mid + 1;
            }
        }
        return -1;
    }
    public int searchPivot(int[] A, int target){
        int l = 0;
        int r = A.length-1;
        int pivot  = -1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(A[mid] == target)
                return mid;
            if(A[mid] >= A[0]){
                l = mid + 1;
            }
            else{
                pivot = mid;
                r = mid - 1;
            }
        }
        return pivot;
    }


    // Approach 2:

    public boolean search2(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[lo] < nums[mid]) {
                if (target >= nums[lo] && target < nums[mid])
                    hi = mid - 1;
                else
                    lo = mid + 1;
            } else if (nums[lo] > nums[mid]) {
                if (target > nums[mid] && target <= nums[hi])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            } else {  // skip the duplicate and move 'lo' up
                lo++;
            }
        }

        return false;
    }
}
