package com.koboolean.sort;

import static com.koboolean.sort.com.module.swap;

public class sec_2_selection {

    public static void main(String[] args) {
        System.out.println("선택정렬");
        int[] result = selectionSort(new int[]{1,6,4,3,7,8,12,7,3,4,6,18,4,2,6,24});

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    /**
     * 데이터 sort를 진행한다.
     * @param data
     * @return
     */
    public static int[] selectionSort(int[] data) {
        // 배열의 마지막 전까지 반복을 진행한다.
        for(int i = 0; i < data.length-1; i++) {
            int index = i;
            // 배열의 index인 i의 위치에 들어갈 최솟값 index를 찾는다.
            for(int j = i + 1; j < data.length; j++) {
                // 만약 최솟값을 찾았다면
                if(data[j] < data[index]){
                    // 최솟값의 index를 index 변수에 넣는다.
                    index = j;
                }
            }

            // 최솟값과 i번째 값을 서로 교환한다.
            swap(data, i, index);
        }


        return data;
    }


}
