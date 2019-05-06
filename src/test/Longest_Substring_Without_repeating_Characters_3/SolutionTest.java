package test.Longest_Substring_Without_repeating_Characters_3;

import junit.framework.TestCase;
import main.Longest_Substring_Without_Repeating_Characters_3.Solution;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                {"tmmzuxt", 5},
                {"abcabcbb", 3},
                {"bbbbb", 1},
                {"pwwkew", 3},
        });
    }

    private String inputVal;
    private int expectedVal;

    public SolutionTest(String inputVal, int expectedVal){
        this.inputVal = inputVal;
        this.expectedVal = expectedVal;
    }

    @Test
    public void testLengthOfLongestSubstring() {
        Solution solution = new Solution();
        //System.out.println(solution.lengthOfLongestSubstring(str));
        assertEquals(expectedVal, solution.lengthOfLongestSubstring(inputVal));
    }
}