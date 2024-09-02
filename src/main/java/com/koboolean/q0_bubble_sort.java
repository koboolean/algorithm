package com.koboolean;

public class q0_bubble_sort {
    /**
     * 버블정렬 알고리즘 Main
     */
    public static void main(String[] args) {
        System.out.println("ASC");
        int[] result = bubbleSortAsc(new int[]{1,6,4,3,7,8,12,7,3,4,6,18,4,2,6,24});

        for(int i : result){
            System.out.print(i + " ");
        }

        System.out.println("\nDESC");
        result = bubbleSortDesc(new int[]{1,6,4,3,7,8,12,7,3,4,6,18,4,2,6,24});

        for(int i : result){
            System.out.print(i + " ");
        }
    }

    /**
     * ASC if (data[j] > data[j + 1])
     * @param data
     * @return
     */
    public static int[] bubbleSortAsc(int[] data) {
        // 배열 전체 순회
        for (int i = 0; i < data.length; i++) {
            // 배열 전체 값 -1 까지 순회
            for (int j = 0; j < data.length - i - 1; j++) {
                /** 뒤에 존재하는 값이 앞의 값보다 작을 경우 */
                if (data[j] > data[j + 1]) {
                    // 앞의 값을 temp 변수에 저장
                    int temp = data[j];
                    // 뒤의 값을 앞으로 가져오기
                    data[j] = data[j + 1];
                    // 앞의 값을 뒤에 저장
                    data[j + 1] = temp;
                }
            }
        }
        return data;
    }

    /**
     * DESC if (data[j] < data[j + 1])
     * @param data
     * @return
     */
    public static int[] bubbleSortDesc(int[] data) {
        // 배열 전체 순회
        for (int i = 0; i < data.length; i++) {
            // 배열 전체 값 -1 까지 순회
            for (int j = 0; j < data.length - i - 1; j++) {
                /** 뒤에 존재하는 값이 앞의 값보다 클 경우 */
                if (data[j] < data[j + 1]) {
                    // 앞의 값을 temp 변수에 저장
                    int temp = data[j];
                    // 뒤의 값을 앞으로 가져오기
                    data[j] = data[j + 1];
                    // 앞의 값을 뒤에 저장
                    data[j + 1] = temp;
                }
            }
        }
        return data;
    }
}
