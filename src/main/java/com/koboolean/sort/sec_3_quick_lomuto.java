package com.koboolean.sort;


import java.util.Arrays;

import static com.koboolean.sort.com.module.swap;

public class sec_3_quick_lomuto {
    public static void main(String[] args) {
        int[] nums = new int[]{1,6,4,3,7,8,12,7,3,4,6,18,4,2,6,24};

        quickSortRecursiveByLomuto(nums, 0, nums.length -1);

        Arrays.stream(nums).forEach(e -> System.out.print(e + " "));
    }

    private static void quickSortRecursiveByLomuto(int[] nums, int left, int right) {
        // 왼쪽값이 오른쪽보다 클 경우, 작업을 종료한다.
        if (left >= right) {
            return;
        }

        int pivot = lomutoPartition(nums, left, right);


        quickSortRecursiveByLomuto(nums, left, pivot-1);
        quickSortRecursiveByLomuto(nums, pivot + 1, right);
    }



    /**
     * Lomuto Algorithm
     * @param nums
     * @param left
     * @param right
     * @return
     */
    private static int lomutoPartition(int[] nums, int left, int right) {

        int pivot = nums[right];

        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (nums[j] <= pivot) {
                ++i;
                swap(nums, i , j);
            }
        }

        int pivotPos = i + 1;
        swap(nums, pivotPos, right);

        return pivotPos;
    }


}
