package com.axelblaze.dsa.Recursion;

import java.util.*;
public class LetterCombinationsOfPhoneNumber {

    public void helper(int i, String s, StringBuilder temp, List<String> ans, HashMap<Character, String> hm) {
        if(i>=s.length()) {
            ans.add(new String(temp.toString()));
            return;
        }

        String str = hm.get(s.charAt(i));
        for(int j=0; j<str.length(); j++) {
            temp.append(str.charAt(j));
            helper(i+1, s, temp, ans, hm);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0)
            return new ArrayList<>();
        HashMap<Character, String> hm = new HashMap<>();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        List<String> ans = new ArrayList<>();
        String temp = "";
        helper(0, digits, new StringBuilder(), ans, hm);
        return ans;
    }
}
