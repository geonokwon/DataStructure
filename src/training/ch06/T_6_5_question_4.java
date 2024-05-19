package training.ch06;

import java.util.Scanner;

public class T_6_5_question_4 {
    //이진 삽입정렬
    static void binInsertionSort(int[] a, int n){
        for (int i = 1; i < n; i++){

            int key = a[i];
            int pl = 0;         // 검색 범위 맨앞의 인덱스
            int pr = i - 1;     // 검색 범위 맨끝의 인덱스
            int pc;             // 검색 범위 중앙의 인덱스
            int pd;             // 삽입하는 위치의 인덱스

            do {
                pc = (pl + pr) / 2;
                if (a[pc] == key) break;
                else if (a[pc] < key) pl = pc + 1;
                else  pr = pc - 1;
            }while (pl <= pr);
            pd = (pl <= pr) ? pc + 1 : pr + 1;

            for (int j = i; j > pd; j--){
                a[j] = a[j - 1];
            }
            a[pd] = key;
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

        binInsertionSort(x, nx);       //배열 x 를 단순 삽입 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++){
            System.out.println("a[" + i + "] = " + x[i]);
        }
    }
}
