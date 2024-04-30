package training.ch02;


import java.util.Arrays;

public class T_2_5_question_1 {
    static void first (int[] a, int idx0, int idx1){
        int t = a[idx0];
        a[idx0] = a[idx1];
        a[idx1] = t;
    }
    static void swap(int[] a){

        for (int i = 0; i < a.length / 2; i++){
            System.out.println(Arrays.toString(a));
            first(a, i, a.length - i - 1);
            System.out.println("a[" + i + "] 과" + "a[" + (a.length - i - 1) + "]을 교환합니다.");
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 9, 6, 7};
        swap(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
