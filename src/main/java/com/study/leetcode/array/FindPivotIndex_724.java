package com.study.leetcode.array;

import java.util.Arrays;

public class FindPivotIndex_724 {

    public static void main(String[] args) {
//        int[] arr = new int[-1, -1, 0, 1, 1, 0];
        int[] arr = {-1, -1, 0, 1, 1, 0};
        int[] arr2 = new int[]{-1, -1, 0, 1, 1, 0};

        FindPivotIndex_724 target = new FindPivotIndex_724();
        System.out.println(target.pivotIndex(arr));
    }

    public int pivotIndex(int[] nums) {

        int sum = Arrays.stream(nums).sum();

        int leftsum = 0;
        int rightSum = sum;
        int previousPivot = 0;
        for (int i = 0; i < nums.length; i++) {
            int pivot = nums[i];
            leftsum = leftsum + previousPivot;
            rightSum = rightSum - pivot;

//            System.out.println(i + ", " + leftsum + ", " + rightSum);
            if (leftsum == rightSum) {
                return i;
            }
            previousPivot = pivot;
        }
        return -1;
    }

}
