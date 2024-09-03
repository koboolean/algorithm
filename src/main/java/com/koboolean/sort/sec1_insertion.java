package com.koboolean.sort;

public class sec1_insertion {

    public static void main(String[] args) {
        System.out.println("삽입정렬");
        int[] result = insertionSort(new int[]{1,6,4,3,7,8,12,7,3,4,6,18,4,2,6,24});

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] insertionSort(int[] data){

        // 0번째는 돌릴 필요 없으므로 배열을 1번째부터 마지막까지 돌린다.
        for(int i=1;i<data.length;i++){
            // 현재 i번째 데이터를 들고와 temp에 입력한다.
            int temp = data[i];

            // while문을 돌리기 위해 현재 i번째 -1까지 돌릴 수 있는 변수 j를 만든다.
            int j = i - 1;

            // i번째 데이터보다 현재 j번째 위치한 데이터가 크면 while문을 반복한다
            while(j >= 0 && temp < data[j]){
                // 이전 데이터들을 오른쪽으로 한칸씩 shift한다.
                data[j+1] = data[j];
                j--;
            }

            /** shift가 완료된 이후 j값 앞의 데이터는 temp값보다 작다는 의미이므로,
             *  해당 값을 j값 데이터 뒤에 넣어준다.
             * */
            data[j+1] = temp;
        }

        return data;
    }

}
