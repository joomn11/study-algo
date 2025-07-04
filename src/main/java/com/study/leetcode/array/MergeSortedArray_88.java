package com.study.leetcode.array;

public class MergeSortedArray_88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1 = m - 1;
        int idx2 = n - 1;

        int i = nums1.length - 1;

        while (idx1 >= 0 && idx2 >= 0) {
            if (nums1[idx1] >= nums2[idx2]) {
                nums1[i] = nums1[idx1];
                idx1--;
            } else {
                nums1[i] = nums2[idx2];
                idx2--;
            }
            i--;
        }

        while (idx2 >= 0) {
            nums1[i] = nums2[idx2];
            i--;
            idx2--;
        }
    }
}
