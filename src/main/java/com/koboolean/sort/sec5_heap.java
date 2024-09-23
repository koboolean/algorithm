package com.koboolean.sort;

import java.util.Arrays;

/**
 * 구현이 복잡하기 때문에 생각보다 많이 사용되지 않는 알고리즘
 * 병합알고리즘이 좀더 구현이 쉽다.
 */
public class sec5_heap {
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;   // 루트를 가장 큰 값으로
        int left = 2 * i + 1;  // 왼쪽 자식
        int right = 2 * i + 2; // 오른쪽 자식

        // 왼쪽 자식이 루트보다 크면
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // 오른쪽 자식이 현재 가장 큰 값보다 크면
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // 가장 큰 값이 루트가 아니면 교환하고 재귀적으로 heapify 호출
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // 최대 힙을 구성 (배열의 중간부터 시작하여 힙을 생성)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // 힙에서 요소를 하나씩 꺼내서 정렬
        for (int i = n - 1; i >= 0; i--) {
            // 현재 루트(가장 큰 값)와 끝 요소를 교환
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // 교환된 요소를 제외하고 다시 heapify
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        heapSort(arr);
        System.out.println("정렬된 배열: " + Arrays.toString(arr));  // [5, 6, 7, 11, 12, 13]
    }
}
