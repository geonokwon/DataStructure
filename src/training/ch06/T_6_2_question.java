package training.ch06;

import java.util.Scanner;

public class T_6_2_question {
    //버블정렬(버전2)
    //a[idx1] 과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    //버블정렬
    static void bubbleSort(int[] a, int n){
        int ccnt = 0;       //비교 횟수
        int scnt = 0;       //교환 횟수
        for (int i = 0; i < n - 1; i++){
            System.out.printf("\n패스%d : \n", i + 1);
            int exchg = 0;                   //패스에서 교환하는 횟수 저장
            for (int j = n - 1; j > i; j--){
                for (int m = 0; m < n - 1; m++){
                    System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-' );
                }
                System.out.printf("%3d\n", a[n - 1]);
                ccnt++;
                if (a[j - 1] > a[j]){
                    swap(a, j -1, j);
                    exchg++;
                    scnt++;
                }
            }
            for (int m = 0; m < n; m++){
                if (m == 0) {
                    System.out.println("정렬된 값은");
                }
                System.out.printf("%3d ", a[m]);
            }
            System.out.println();
            if (exchg == 0) break; //교환이 이루어지지 않으므로 멈춤
        }
        System.out.println("비교를 " + ccnt + "회 했습니다.");
        System.out.println("교환을 " + scnt + "회 했습니다.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("버블 정렬(버전2)");
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
