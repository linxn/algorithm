package main.Letter_Combinations_of_a_Phone_Number_17;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() < 1) return new LinkedList<>();
        String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new LinkedList<>();
        List<String> tmp = new LinkedList<>();
        String first = letters[Integer.parseInt(digits.charAt(0)+"")];
        for (int i = 0; i < first.length(); i++) {
            result.add(first.charAt(i) + "");
        }
        for (int i = 1; i < digits.length(); i++) {
            tmp.addAll(result);
            result.clear();
            String str = letters[Integer.parseInt(digits.charAt(i)+"")];
            for (int j = 0; j < str.length(); j++) {
                for (Iterator iterator = tmp.iterator(); iterator.hasNext();) {
                    result.add((String)iterator.next() + str.charAt(j));
                }
            }
            tmp.clear();
        }
        return result;
    }
}
