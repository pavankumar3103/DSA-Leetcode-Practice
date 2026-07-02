package arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem: Two Sum
 * LeetCode URL: https://leetcode.com/problems/two-sum/
 * Difficulty: Easy
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            seen.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
