package com.axelblaze.dsa.BinarySearch;

public class SearchIn2DMatrix2 {

    /*

    Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

    Integers in each row are sorted in ascending from left to right.
    Integers in each column are sorted in ascending from top to bottom.
     */


    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        if(r>0 && c>0){
            int i=0, j=c-1;
            while(i>=0 && i<r && j>=0 && j<c){
                int val = matrix[i][j];
                if(val > target){
                    j--;
                }
                else if(val < target){
                    i++;
                }
                else{
                    return true;
                }
            }
            return false;
        }
        if(r>0 && c==0){
            if(matrix[r][0] == target)
                return true;
        }
        return false;

    }
}
