package com.axelblaze.recursion.Recursion;

public class wordSearch {
    public boolean helper(int i, int j, int n, int m, char[][] board, String word, int k) {
        if(k == word.length()) return true;
        if(i<0 || j<0 || i==n || j==m || board[i][j] != word.charAt(k)) return false;

        char ch = board[i][j];
        board[i][j] = '#';
        boolean op1 = helper(i+1, j, n, m, board, word, k+1);
        boolean op2 = helper(i, j+1, n, m, board, word, k+1);
        boolean op3 = helper(i-1, j, n, m, board, word, k+1);
        boolean op4 = helper(i, j-1, n, m, board, word, k+1);
        board[i][j] = ch;

        return op1 || op2 || op3 || op4;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == word.charAt(0))
                    if(helper(i, j, board.length, board[0].length, board, word, 0))
                        return true;
            }
        }
        return false;
    }

}
