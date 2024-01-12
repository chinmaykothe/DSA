package com.axelblaze.dsa.BinarySearch.unsolved;

public class NumberOfTimesArrayIsSortedAndRotated {

    public static int findKRotation(int []arr) {
        // Write your code here.
        int pivot = -1;
        int n = arr.length;
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid == n - 1) {
                break;
            }

            if (arr[mid] > arr[mid + 1]) {
                pivot = mid;
                break;
            } else if (arr[0] > arr[mid])
                e = mid - 1;
            else if (arr[0] <= arr[mid])
                s = mid + 1;
        }
        if (pivot == -1)
            return 0;
        return pivot + 1;
    }
}
