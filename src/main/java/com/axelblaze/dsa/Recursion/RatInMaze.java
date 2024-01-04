package com.axelblaze.dsa.Recursion;

import java.util.* ;
public class RatInMaze {

    public static void helper(int i, int j, int n, int[][] arr, String path, ArrayList<String> ans) {

        if(i<0 || j<0 || i==n || j==n || arr[i][j] == 0) return;

        if(i==n-1 && j==n-1) {
            ans.add(path);
            return;
        }
        arr[i][j] = 0;
        //down
        path += "D";
        helper(i+1, j, n, arr, path, ans);
        path = path.substring(0, path.length() - 1);

        //left
        path += "L";
        helper(i, j-1, n, arr, path, ans);
        path = path.substring(0, path.length() - 1);

        //right
        path += "R";
        helper(i, j+1, n, arr, path, ans);
        path = path.substring(0, path.length() - 1);

        //up
        path += "U";
        helper(i-1, j, n, arr, path, ans);
        path = path.substring(0, path.length() - 1);
        arr[i][j] = 1;
    }
    public static ArrayList < String > findSum(int[][] arr, int n) {
        // Write your code here.
        String path = "";
        ArrayList<String> ans = new ArrayList<>();
        helper(0,0, arr.length, arr, path, ans);
        return ans;
    }
}
