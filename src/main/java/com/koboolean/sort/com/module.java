package com.koboolean.sort.com;

public class module {
    /**
     * changeIndex 위치의 값과 index번째 값을 서로 교환한다.
     * @param data
     * @param index
     * @param changeIndex
     */
    public static void swap(int[] data, int index, int changeIndex) {
        int temp = data[index];
        data[index] = data[changeIndex];
        data[changeIndex] = temp;
    }
}
