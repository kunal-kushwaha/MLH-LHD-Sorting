package com.kunal;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4,3,5,7,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    // length is 5, 4 [0, 1, 2, 3, 4]
    // O(N^2)
    public static void bubble(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j-1]) {
                    swap(nums, j, j-1);
                }
            }
        }
    }

    // O(N^2)
    public static void selection(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - 1 - i;
            int max = max_limit(nums, last);
            swap(nums, max, last);
        }
    }

    private static int max_limit(int[] nums, int end) {
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void insertion(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (nums[j] < nums[j-1]) {
                    swap(nums, j-1, j);
                } else {
                    break;
                }
            }
        }
    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
