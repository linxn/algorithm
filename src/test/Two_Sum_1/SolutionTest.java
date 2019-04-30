package test.Two_Sum_1;

import main.Two_Sum_1.Solution;
import org.junit.Test;
import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

//complete paramater test

@RunWith(Parameterized.class)
public class SolutionTest extends TestCase {
    @Parameterized.Parameters
    public static Collection data(){
        int[] input_a1 = {2, 7, 11, 15};
        int[] output_a1 = {1, 0};
        return Arrays.asList(new Object[][] {
                {input_a1, 9, output_a1}
        });
    }

    int[] inputVal_1;
    int inputVal_2;
    int[] outputVal;

    public SolutionTest(int[] inputVal_1, int inputVal_2 ,int[] outputVal) {
        this.inputVal_1 = inputVal_1;
        this.inputVal_2 = inputVal_2;
        this.outputVal = outputVal;
    }

    @Test
    public void testTwoSum() throws Exception{
        Solution solution = new Solution();
        assertArrayEquals(solution.twoSum(inputVal_1, inputVal_2), outputVal);

    }
}