package com.study.leetcode.array;

public class MinimumSizeSubarraySum_209 {

    public int minSubArrayLen(int target, int[] nums) {

        int follower = 0;
        int rst = Integer.MAX_VALUE;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum >= target) {
                int tmp = i - follower + 1;
                if (tmp < rst) {
                    rst = tmp;
                }

                for (int j = follower; j < i; j++) {
                    follower++;
                    currentSum -= nums[j];
                    if (currentSum >= target) {
                        tmp = i - j;
                        if (tmp < rst) {
                            rst = tmp;
                        }
                    } else {
                        break;
                    }
                }
            }
        }

        if (rst == Integer.MAX_VALUE) {
            rst = 0;
        }
        return rst;
    }

    public int minSubArrayLen2(int target, int[] nums) {

        int right = 0;
        int left = 0;
        int sum = 0;
        int rst = Integer.MAX_VALUE;

        for (right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                rst = Math.min(rst, right - left + 1);
                sum -= nums[left++];
            }
        }

        return rst == Integer.MAX_VALUE ? 0 : rst;
    }
}
