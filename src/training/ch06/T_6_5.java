package training.ch06;

import java.util.Scanner;

public class T_6_5 {
    //단순 삽입정렬
    static void insertionSort(int[] a, int n){
        for (int i = 1; i < n; i++){
            int j;
            int temp = a[i];
            for (j = i; j > 0 && a[j - 1] > temp; j--){
                a[j] = a[j - 1];
            }
            a[j] = temp;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("단순산입정렬");
        System.out.print("요솟수 : ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++){
            System.out.print("a[" + i + "] = ");
            x[i] = scanner.nextInt();
        }

        insertionSort(x, nx);       //배열 x 를 단순 삽입 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++){
            System.out.println("a[" + i + "] = " + x[i]);
        }
    }
}
