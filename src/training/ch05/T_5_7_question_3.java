package training.ch05;

import java.util.Scanner;
import java.util.Stack;

public class T_5_7_question_3 {

    static void move(int no, int x, int y){
        //charAt 으로 순번을 표시할 알파뱃 전부를 순서대로 저장하는데 맨앞에 0번째는 비운다
        String alpha = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (no > 1){
            move(no - 1, x, 6 - x - y);
        }
        //charAt 을 사용해서 순번대로 알파뱃으로 변경하여 출력
        System.out.printf("원반[%d]을(를) %s 기둥에서 %s 기둥으로 옮김\n", no, alpha.charAt(x), alpha.charAt(y));
        if (no > 1){
            move(no - 1 , 6 - x - y, y);
        }

    }
    //비 재귀적으로 move 메서드를 수정해보기 (이해가 잘 가지않는다 다시한번 꼭보기!)
    static void moveBeta(int no, int x, int y){
        System.out.println("-------------------------------------------------");
        int[] xstk = new int[100];
        int[] ystk = new int[100];
        int[] sstk = new int[100];		    // 스택
        int ptr = 0; 						// 스택포인터
        int sw = 0;

        while (true) {
            if (sw == 0 && no > 1) {
                xstk[ptr] = x;						// x의 값을 푸시
                ystk[ptr] = y;						// y의 값을 푸시
                sstk[ptr] = sw;						// sw의 값을 푸시
                ptr++;
                no = no - 1;
                y = 6  - x - y;
                continue;
            }
            System.out.printf("원반[%d]을 %d 기둥에서 %d 기둥으로 이동\n", no, x, y);
            if (sw == 1 && no > 1) {
                xstk[ptr] = x;						// x의 값을 푸시
                ystk[ptr] = y;						// y의 값을 푸시
                sstk[ptr] = sw;						// sw의 값을 푸시
                ptr++;
                no = no - 1;
                x = 6  - x - y;
                if (++sw == 2) sw = 0;
                continue;
            }
            do {
                if (ptr-- == 0) 					// 스택이 비어 있으면
                    return;
                x  = xstk[ptr]; 					// 값을 저장하고 있는 x를 팝
                y  = ystk[ptr]; 					// 값을 저장하고 있는 y을 팝
                sw = sstk[ptr] + 1;				    // 값을 저장하고 있는 sw을 팝
                no++;
            } while (sw == 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수 : ");
        int n = scanner.nextInt();

        move(n,1,3);
        moveBeta(n, 1, 3);

    }
}
