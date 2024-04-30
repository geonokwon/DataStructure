package training.ch02;

import java.util.Arrays;

public class T_2_5_question_4 {
    static void rcopy(int[] a, int[] b){
        for (int i = 0; i < a.length; i++){
            a[i] = b[b.length - i - 1];
        }
    }

    public static void main(String[] args) {
        int[] arrA = new int[7];
        int[] arrB = {2, 5, 1, 3, 9, 6, 7};

        rcopy(arrA, arrB);
        System.out.println("배열 B 는 " + Arrays.toString(arrB) + "이고, 역순으로 " + Arrays.toString(arrA) + " 정렬 하였음. ");
    }
}
