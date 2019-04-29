package main.Two_Sum_1;

import java.util.HashMap;
import java.util.Map;
/*
* 1. Two Sum
* use treeMap
* time complexity : O(n)
* space complexity: O(n)
* Throw IllegalArgumentException
* */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length < 2)
            throw new IllegalArgumentException("No even two nums");
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                // find result
                int tmp = map.get(target - nums[i]);
                return new int[] {i, tmp};
            }else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
