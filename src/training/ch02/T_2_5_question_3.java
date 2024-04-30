package training.ch02;

import java.util.Arrays;

public class T_2_5_question_3 {
    static void copy(int[] a, int[] b){
        for (int i = 0; i < a.length; i++){
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        int[] arrA = new int[7];
        int[] arrB = {2, 5, 1, 3, 9, 6, 7};

        copy(arrA, arrB);
        System.out.println("배열 B : " + Arrays.toString(arrB) + "이고 복사한 배열은 : " + Arrays.toString(arrB) + "입니다.");

    }
}
