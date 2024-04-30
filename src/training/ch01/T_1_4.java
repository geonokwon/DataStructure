package training.ch01;

import java.util.Scanner;

public class T_1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 조건 판단의 분기 = 3개로 분기
        if (n == 1) System.out.println("A");
        else if (n == 2) System.out.println("B");
        else System.out.println("C");

        //정황상 3개로 분기 한것 처럼 보이지만 4개로 분기한것.
        if (n == 1) System.out.println("A");
        else if (n == 2) System.out.println("B");
        else if (n == 3) System.out.println("C");

        //마지막에 else가 숨어있는것과 같음.
        if (n == 1) System.out.println("A");
        else if (n == 2) System.out.println("B");
        else if (n == 3) System.out.println("C");
        else ;

    }
}
