package test.Longest_Palindromic_Substring_5;

import main.Longest_Palindromic_Substring_5.Solution;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class SolutionTest {

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                {"cbbd", "bb"},
                {"abcba", "abcba"},
                {"babad", "aba"},
                {"aaaabaaa", "aaabaaa"},
        });
    }

    private String inputVal;
    private String expectedVal;
    private Solution solution;

    public SolutionTest(String inputVal, String expectedVal){
        this.inputVal = inputVal;
        this.expectedVal = expectedVal;
        solution = new Solution();
    }

    @Test
    public void longestPalindrome_1_DP() {
        //System.out.println(solution.longestPalindrome_1_DP(inputVal));
        assertEquals(expectedVal, solution.longestPalindrome_1_DP(inputVal));
    }

    @Test
    public void longestPalindrome_2_M() {
        System.out.println(solution.longestPalindrome_2_M(inputVal));
        assertEquals(expectedVal, solution.longestPalindrome_2_M(inputVal));
    }
}