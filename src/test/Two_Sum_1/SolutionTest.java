package test.Two_Sum_1;

import main.Two_Sum_1.Solution;
import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest extends TestCase {

    @Test
    public void testTwoSum() throws Exception{
        int[] nums = {2, 7, 11, 15};
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums,9);
        System.out.println(Arrays.toString(result));
        //assertArrayEquals(result,new int[] {1,0});

    }
}