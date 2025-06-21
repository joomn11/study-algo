package com.study.leetcode.array;

public class MoveZeros_283 {

    public void moveZeroes(int[] nums) {
        int i = 0; // point 0
        int j = 0; // find num

        for (; j < nums.length; j++) {
            if (nums[j] != 0) { // !! found
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;

                i++;
            }
        }

    }
}
