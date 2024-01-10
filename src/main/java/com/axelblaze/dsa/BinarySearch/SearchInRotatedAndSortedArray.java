package com.axelblaze.dsa.BinarySearch;

public class SearchInRotatedAndSortedArray {
    public int search(int[] nums, int target) {
        int pivot = searchPivot(nums, target);
        if(pivot != -1 && nums[pivot] == target)
            return pivot;
        if(pivot == -1){
            return searchTarget(nums, 0, nums.length-1, target);
        }
        if(target >= nums[0]){
            return searchTarget(nums, 0, pivot-1, target);
        }
        else{
            return searchTarget(nums, pivot, nums.length-1, target);
        }
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
}
