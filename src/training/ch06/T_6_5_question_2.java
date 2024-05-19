package training.ch06;

import java.util.Arrays;
import java.util.Scanner;

public class T_6_5_question_2 {
    static void print(int[] a, int min, int select){
        String[] result = new String[a.length];
        Arrays.fill(result, " ");
        for (int i = min; i < select; i++){
            result[i] = "---";
        }

        result[min] = "^";
        if (min == select){
            result[select] = "+";
        }
        else
            result[select] = "--+";

        for (String b : result){
            System.out.printf("%3s", b);
        }
        System.out.println();
    }

    //단순 삽입정렬
    static void insertionSort(int[] a, int n){
        int i;
        int j;
        for (i = 1; i < n; i++){
            int temp = a[i];
            for (int k : a) {
                System.out.printf("%3d", k);
            }
            System.out.println();
            for (j = i; j > 0 && a[j - 1] > temp; j--){
                a[j] = a[j - 1];
            }
            a[j] = temp;
            print(a, j, i);
        }
        for (int k : a) {
            System.out.printf("%3d", k);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단순 삽입 정렬");
        System.out.print("요솟수 : ");
        int nx = scanner.nextInt();
        int[] x = {6,4,8,5,2,9,7};
//        int[] x = new int[nx];
//
//        for (int i = 0; i < nx; i++){
//            System.out.print("a[" + i + "] = ");
//            x[i] = scanner.nextInt();
//        }

        insertionSort(x, nx);       //배열 x 를 단순 삽입 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++){
            System.out.println("a[" + i + "] = " + x[i]);
        }
    }
}
