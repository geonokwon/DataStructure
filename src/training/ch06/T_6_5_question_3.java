package training.ch06;

import java.util.Scanner;

public class T_6_5_question_3 {
    //단순삽입정렬(보초법 : 배열의 맨앞 요소는 비어 있음)
    static void insertionSort(int[] a, int n) {
        for (int i = 2; i < n; i++) {
            int tmp = a[0] = a[i];
            int j = i;
            for ( ; a[j - 1] > tmp; j--)
                a[j] = a[j - 1];
            if (j > 0){ a[j] = tmp; }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단순산입정렬");
        System.out.print("요솟수 : ");
        int nx = scanner.nextInt();
        int[] x = new int[nx + 1];      //x[0]에 보초를 사용할 것이므로 여분으로 하나더 생성

        for (int i = 1; i <= nx; i++){
            System.out.print("a[" + i + "] = ");
            x[i] = scanner.nextInt();
        }

        insertionSort(x, nx + 1);       //배열 x 를 단순 삽입 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 1; i <= nx; i++){
            System.out.println("a[" + i + "] = " + x[i]);
        }

    }
}
