package training.ch06;

import java.util.Scanner;

public class T_6_2 {
    //버블정렬(버전2)
    //a[idx1] 과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    //버블정렬
    static void bubbleSort(int[] a, int n){
        for (int i = 0; i < n - 1; i++){
            int exchg = 0;                   //패스에서 교환하는 횟수 저장

            for (int j = n - 1; j > i; j--){
                if (a[j - 1] > a[j]){
                    swap(a, j -1, j);
                    exchg++;
                }
                if (exchg == 0) break; //교환이 이루어지지 않으므로 멈춤
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
