package main.Longest_Substring_Without_Repeating_Characters_3;

import java.util.Arrays;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 2) return s.length();
        int[] charIndex = new int[257];
        for (int i = 0; i < charIndex.length; i++) {
            charIndex[i] = -1;
        }
        int left = 0, right = 0, max_length = Integer.MIN_VALUE;
        while (right < s.length()) {
            if(charIndex[s.charAt(right)] != -1 && charIndex[s.charAt(right)] >= left){
                left = charIndex[s.charAt(right)] + 1;
            } else {
              max_length = Math.max(right - left + 1, max_length);
            }
            charIndex[s.charAt(right)] = right;
            right++;
        }
        return max_length;
    }
}
