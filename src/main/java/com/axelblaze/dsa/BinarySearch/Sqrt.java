package com.axelblaze.dsa.BinarySearch;

public class Sqrt {
    public int mySqrt(int x) {
        long s=0, e=x;
        long ans = 0;
        while(s<=e) {
            long mid=s+((long)e-s)/2;
            if(mid*mid <= x) {
                ans = mid;
                s = mid+1;
            }
            else
                e = mid-1;
        }
        return (int) ans;
    }
}
