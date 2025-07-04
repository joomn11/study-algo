package com.study.leetcode.array;

public class SortColors_75 {

    public void sortColors(int[] nums) {
        int idx0 = 0;
        int idx2 = nums.length - 1;
        int i = 0;
        while (i <= idx2) {
            if (nums[i] == 0) {
                swap(i, idx0, nums);
                i++;
                idx0++;
            } else if (nums[i] == 2) {
                swap(i, idx2, nums);
                idx2--;
            } else { // nums[i] == 1
                i++;
            }
        }

    }

    private void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
