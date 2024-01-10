package com.axelblaze.dsa.BinarySearch.unsolved;

public class SmallestLetterGreaterThanTarget {

    /*
    You are given an array of characters letters that is sorted in non-decreasing order,
    and a character target. There are at least two different characters in letters.

    Return the smallest character in letters that is lexicographically greater than target.
    If such a character does not exist, return the first character in letters.

     */


    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length-1;
        char ans = ' ';
        while(s<=e){
            int mid = (s+e)/2;
            if(letters[mid] == target){
                s = mid+1;
            }
            else if(letters[mid] - 'a' > target - 'a'){
                ans = letters[mid];
                e = mid-1;
            }
            else
                s = s+1;
        }
        if(ans != ' ')
            return ans;
        return letters[0];
    }
}
