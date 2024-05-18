package training.ch06;

import java.util.Arrays;
import java.util.Scanner;

public class T_6_4_question_1 {
    //단순 선택 정렬

    static void print(int[]a, int i, int min){
        String[] result = new String[a.length];
        Arrays.fill(result, " ");
        result[min] = "+";
        result[i] = "*";
        for (String s : result){
            System.out.printf("%2s", s);
        }
        System.out.println();
        for (int m = 0; m < a.length; m++) {
            System.out.printf("%2d", a[m]);
        }
        System.out.println();
    }

    //a[idx1] 과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    static void selectionSort(int[] a, int n){
        for (int i = 0; i < n - 1; i++){
            int min = i;         //아직 정렬되지 않은 부분에서 가장 잡은 요소의 인덱스를 저장

            for (int j = i + 1; j < n; j++){
                if (a[j] < a[min]){
                    min = j;
                }
            }
            print(a, i, min);
            swap(a, i, min);
        }
        print(a, n - 1, n - 1);
    }
    //같은 값이 있을때 같은값의 순서를 뒤바꾸는 것을 통해 -- 안정적인 교환이 이루어 지지 않는다!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단순 선택 정렬");
        System.out.print("요솟수 : ");

        int[] x = {6,4,8,3,1,9,7};
        int nx = scanner.nextInt();
//        int[] x = new int[nx];

//        for (int i = 0; i < nx; i++){
//            System.out.print("x[" + i + "] : ");
//            x[i] = scanner.nextInt();
//        }

        selectionSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
