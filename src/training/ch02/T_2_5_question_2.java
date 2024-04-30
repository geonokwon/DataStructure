package training.ch02;


public class T_2_5_question_2 {
    static int sumOf(int[] a){
        int max = 0;
        for (int i = 0; i < a.length; i++){
            max += a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 9, 6, 7};
        System.out.println("배열의 모든 수의 합은 :" + sumOf(arr));
    }
}
