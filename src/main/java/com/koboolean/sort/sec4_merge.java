package com.koboolean.sort;

import java.util.Arrays;

public class sec4_merge {
    public static void main(String[] args) {
        int[] nums = new int[]{1,6,4,3,7,8,12,7,3,4,6,18,4,2,6,24};

        mergeSort(nums, 0, nums.length -1);

        Arrays.stream(nums).forEach(e -> System.out.print(e + " "));
    }

    private static void mergeSort(int[] nums, int left, int right) {
        // 1 : 1 값을 가질때까지 배열을 나눈다.
        if(left < right) {
            // 배열의 중간값을 계산한다.
            int mid = (left + right) / 2;

            // 배열을 중앙을 기준으로 또다른 배열로 만든다. -> 1:1이 성립할 때까지
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);

            // 정렬을 수행한다.
            merge(nums, left, mid, right);
        }
    }

    private static void merge(int[] nums, int left, int mid, int right) {
        // 둘로 나눈 임시 배열을 생성한다.
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // 왼쪽 정렬
        int[] leftValue = new int[n1];
        for(int i = 0; i < n1; i++) {
            leftValue[i] = nums[left + i];
        }

        // 오른쪽 정렬
        int[] rightValue = new int[n2];
        for(int i = 0; i < n2; i++) {
            rightValue[i] = nums[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;

        while(i < n1 && j < n2){
            if(leftValue[i] <= rightValue[j]){
                // 왼쪽 값이 오른쪽 값보다 클 경우 왼쪽 값을 List에 넣는다.
                nums[k] = leftValue[i];
                i++;
            }else{
                // 오른쪽 값이 왼쪽 값보다 클 경우 오른쪽 값을 List에 넣는다.
                nums[k] = rightValue[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            nums[k] = leftValue[i];
            i++;
            k++;
        }

        while(j < n2){
            nums[k] = rightValue[j];
            j++;
            k++;
        }
    }
}
