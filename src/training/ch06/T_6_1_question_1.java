package training.ch06;

import java.util.Scanner;

public class T_6_1_question_1 {
    //버블정렬(버전1) -- 앞에서부터 비교하기
    //a[idx1] 과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    //버블정렬 -- 앞에서 부터 비교해서 올라가는 방식
    static void bubbleSort(int[] a, int n){
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i + 1, i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("버블 정렬(버전1)");
        System.out.print("요솟수 : ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        bubbleSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

}
