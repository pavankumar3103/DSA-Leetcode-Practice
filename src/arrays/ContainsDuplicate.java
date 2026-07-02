package arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem: Contains Duplicate
 * LeetCode URL: https://leetcode.com/problems/contains-duplicate/
 * Difficulty: Easy
 */
class ContainsDuplicate {

    public int[] containsDuplicate(int[] nums, int target) {
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
