package training.ch05;

import java.util.Scanner;

public class T_5_7_question_2 {
    static void move(int no, int x, int y){
        //charAt 으로 순번을 표시할 알파뱃 전부를 순서대로 저장하는데 맨앞에 0번째는 비운다
        String alpha = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if (no > 1){
            move(no - 1, x, 6 - x - y);
        }
        //charAt 을 사용해서 순번대로 알파뱃으로 변경하여 출력
        System.out.printf("원반[%d]을(를) %s 기둥에서 %s 기둥으로 옮김\n", no, alpha.charAt(x), alpha.charAt(y));
        if (no > 1){
            move(no -1 , 6 - x - y, y);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수 : ");
        int n = scanner.nextInt();

        move(n,1,3);

    }
}
