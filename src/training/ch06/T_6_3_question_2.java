package training.ch06;

import java.util.Scanner;

public class T_6_3_question_2 {
    //버블정렬(버전3 - 양방향 버블정렬)
    //a[idx1] 과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    //양방향 버블정렬
    static void bubbleSort(int[] a, int n){
        int ccnt = 0;       //비교 횟수
        int scnt = 0;       //교환 횟수
        int k = 0;          //a[k] 보다 앞쪽은 정렬을 마친 상태
        int passCount = 1;  //패스 카운터

        while(k < n - 1){
            int last = n - 1;
            System.out.printf("패스%d : \n", passCount++);
            int exchg = 0;                   //패스에서 교환하는 횟수 저장

            if (passCount % 2 == 0) { //짝수일 때 가장큰 요소를 맨뒤로 옮기기
                for (int j = n - 1; j > k; j--) {
                    for (int m = 0; m < n - 1; m++) {
                        System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
                    }
                    System.out.printf("%3d\n", a[n - 1]);
                    ccnt++;
                    if (a[j - 1] > a[j]) {
                        swap(a, j - 1, j);
                        exchg++;
                        scnt++;
                        last = j;
                    }
                }
            }

            if(passCount % 2 == 1) { //홀수일 때 가장작은 요소를 맨앞으로 옮기기
                for (int j = 0; j < n - k; j++) {
                    for (int m = 0; m < n - 1; m++) {
                        System.out.printf("%3d %c", a[m], (m != j) ? ' ' : (a[j] > a[j + 1]) ? '+' : '-');
                    }
                    System.out.printf("%3d\n", a[n - 1]);
                    ccnt++;
                    if (a[j] > a[j + 1]) {
                        swap(a, j + 1, j);
                        exchg++;
                        scnt++;
                        last = j;
                    }
                }
            }

            for (int m = 0; m < n; m++){
                if (m == 0) {
                    System.out.println("정렬된 값은");
                }
                System.out.printf("%3d ", a[m]);
            }
            System.out.println();
            k = last;
            if (exchg == 0) break; //교환이 이루어지지 않으므로 멈춤
        }
        System.out.println("비교를 " + ccnt + "회 했습니다.");
        System.out.println("교환을 " + scnt + "회 했습니다.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("버블정렬(버전4 - 양방향 버블정렬)");
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
