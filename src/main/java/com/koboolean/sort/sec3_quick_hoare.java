package com.koboolean.sort;

import java.util.Arrays;

import static com.koboolean.sort.com.module.swap;

public class sec3_quick_hoare {

    public static void main(String[] args) {
        int[] nums = new int[]{1,6,4,3,7,8,12,7,3,4,6,18,4,2,6,24};

        quickSortRecursiveByHoare(nums, 0, nums.length -1);

        Arrays.stream(nums).forEach(e -> System.out.print(e + " "));
    }

    private static void quickSortRecursiveByHoare(int[] nums, int left, int right) {
        // 왼쪽값이 오른쪽보다 클 경우, 작업을 종료한다.
        if (left >= right) {
            return;
        }

        int pivot = hoarePartition(nums, left, right);


        quickSortRecursiveByHoare(nums, left, pivot);
        quickSortRecursiveByHoare(nums, pivot + 1, right);
    }

    /**
     * Hoare 알고리즘 적용
     * @param nums
     * @param low
     * @param high
     * @return
     */
    static int hoarePartition(int[] nums, int low, int high) {
        int pivot = nums[low]; // 피벗을 배열의 첫 번째 요소로 선택
        int i = low - 1;
        int j = high + 1;

        while (true) {
            // 왼쪽에서 오른쪽으로 이동하여 피벗보다 큰 요소 찾기
            do {
                i++;
            } while (nums[i] < pivot);

            // 오른쪽에서 왼쪽으로 이동하여 피벗보다 작은 요소 찾기
            do {
                j--;
            } while (nums[j] > pivot);

            // i와 j가 교차하면 파티션 종료
            if (i >= j)
                return j;

            // 요소 교환
            swap(nums, i, j);
        }
    }


}
