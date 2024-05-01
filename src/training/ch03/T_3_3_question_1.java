package training.ch03;

import java.util.Scanner;

public class T_3_3_question_1 {
    //요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색
    static int seqSearchSen(int[] a, int n, int key){
        int i;
        a[n] = key; //보초인덱스 에 키값을 저장
        for (i = 0; i < n; i++){
            if (a[i] == key){
                return i;
            }
        }
        return i == n ? -1 : i;     //보초인지 판단함 i == n 이면 보초이므로 -1 반환 아니라면 i 를 반환
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num + 1];     //요솟수가 n+1인 배열

        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "]: ");         //key값을 입력 받음.
            x[i] = scanner.nextInt();
        }
        System.out.print("검색할 값 : ");       //배열x 에서 값이 ky인 요소를 검색
        int ky = scanner.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if (idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        }
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}
