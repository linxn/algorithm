package main.Longest_Palindromic_Substring_5;

/*
 * 5. Longest Palindromic Substring
 *  熟悉动态规划 和马拉车算法
 * */
public class Solution {
    //Dynamic Programming
    public String longestPalindrome_1_DP(String s) {
        if (s.length() < 2) return s;
        int[][] flag = new int[s.length()][s.length()];
        int left = 0, right = 0, max = 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                //init
                if (j == i) {
                    flag[i][j] = 1;
                    continue;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    if(j == i + 1 || flag[i + 1][j - 1] == 1){
                        flag[i][j] = 1;
                        if(j - i + 1 > max){
                            left = i;
                            right = j;
                            max = j - i + 1;
                        }
                    }
                }
            }
        }
        return s.substring(left, right + 1);
    }

    //Manacher's algorithm
    public String longestPalindrome_2_M(String s){
        if (s.length() < 2) return s;
        StringBuffer sf = new StringBuffer("$#");
        for (int i = 0; i < s.length(); i++) {
            sf.append(s.charAt(i));
            sf.append("#");
        }
        int result_ID = 0, ID = 0, MX = 0, max_length = 0;
        int[] p = new int[sf.length()];
        for (int i = 0; i < sf.length(); i++) {
            p[i] = (i < MX ? Math.min(p[ID * 2 - i], MX - i) : 1);
            while (i - p[i] >= 0 && i + p[i] < sf.length()){
                if(sf.charAt(i - p[i]) == sf.charAt(i + p[i])) {
                    p[i]++;
                }else {
                    break;
                }
            }
            if (i + p[i] - 1 > MX) {
                ID = i;
                MX = i + p[i] - 1;
            }
            if (max_length < p[i] - 1) {
               max_length = p[i] - 1;
               result_ID = i;
            }
        }
        int index = (result_ID - p[result_ID]) / 2;
        return s.substring(index, index + p[result_ID] - 1);
    }


}
