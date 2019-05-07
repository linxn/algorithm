package test.Letter_Combinations_of_a_Phone_Number_17;

import main.Letter_Combinations_of_a_Phone_Number_17.Solution;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testLetterCombinations() {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.letterCombinations("23").toArray()));
    }
}