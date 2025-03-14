package com.l034;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        int[] arr = searchRange(nums, target);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static int[] searchRange(int[] nums, int target) {
        int leftBorder = findLeftBorder( nums, target);
        int rightBorder = findRightBorder(nums, target);
        if (leftBorder == -2 || rightBorder == -2) {
            return new int[] {-1,-1};
        }
        if (rightBorder - leftBorder > 1) {
            return new int[] {leftBorder + 1,rightBorder - 1};
        }
        return new int[] {-1,-1};
    }

    public static int findLeftBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int leftBorder = -2;//初始化一下左边界的值
        while(left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] < target) {
                //如果left一直加到等于right都没有找到
                //说明此target在数组右侧之外
                left = middle + 1;
            } else {
                right = middle - 1;
                leftBorder = right;
            }
        }
        return leftBorder;
    }

    public static int findRightBorder(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int rightBorder = -2;//初始化一下右边界的值
        while(left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] > target) {
                right = middle - 1;
            //当nums[middle] <= target 时
            } else {
                left = middle + 1;
                rightBorder = left;
            }
        }
        return rightBorder;
    }
}
