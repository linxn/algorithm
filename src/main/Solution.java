package main;

import java.util.Map;

public class Solution {
    //Dynamic Programming
    public String longestPalindrome(String s) {
        return longestPalindromeDP(s, 0, s.length() - 1);
    }

    public String longestPalindromeDP(String s, int left, int right) {
        //odd
        if(left == right) return s.substring(left, right + 1);
        //even
        if(left == right - 1 && s.charAt(left) == s.charAt(right)){
            return s.substring(left, right + 1);
        }
        if(s.charAt(left) == s.charAt(right)){
            return s.charAt(left) + longestPalindromeDP(s, left + 1, right - 1) + s.charAt(right);
        }else {
            String s1 = longestPalindromeDP(s, left + 1, right);
            String s2 = longestPalindromeDP(s, left, right - 1);
            return (s1.length() > s2.length() ? s1 : s2);
        }
    }
}
