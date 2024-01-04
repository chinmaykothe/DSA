package com.axelblaze.dsa.Recursion;

public class FloodFill {

    public void helper(int i, int j, int n, int m, int oldColor, int newColor, int[][] image) {
        if(i<0 || j<0 || i==n || j==m || image[i][j]!=oldColor ) return;

        image[i][j] = newColor;
        helper(i+1, j, n, m, oldColor, newColor, image);
        helper(i, j+1, n, m, oldColor, newColor, image);
        helper(i-1, j, n, m, oldColor, newColor, image);
        helper(i, j-1, n, m, oldColor, newColor, image);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if(oldColor == color) return image;
        helper(sr, sc, image.length, image[0].length, oldColor, color, image);
        return image;
    }
}
