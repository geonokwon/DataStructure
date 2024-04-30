package training.ch02;

import java.util.Scanner;

public class T_2_6_question_1 {
    //정수값 x 를 r 진수로 변환하여 배열 d 에 아랫자리부터 넣어 두고 자릿수를 반환
    static int cardConv(int x, int r, char[] d){
        int digits = 0;  //변환 후의 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            System.out.printf("%3d", r);
            System.out.print("|" + " ".repeat(6));
            System.out.printf("%3d", x);
            if (digits != 0){
                System.out.println(" ・・・ " + d[digits - 1] );
            }else System.out.println();
            d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지 저장
            x /= r;
            System.out.println("   +" + "-".repeat(9));
        } while (x != 0);
        System.out.print(" ".repeat(10));
        System.out.printf("%3d", x);
        System.out.println(" ・・・ " + d[digits - 1]);

        for (int i = 0; i < digits / 2; i++){
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no;                     //변환 하는 정수
        int cd;                     //기수
        int dno;                    //변환 후의 자릿수
        int retry;                  //다시한번?
        char[] cno = new char[32];  //변호한 후 각 자리의 숫자를 넣어 두는 문자 배열

        System.out.println("10진수를 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수: ");
                no = scanner.nextInt();
            }while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2 ~ 36) : ");
                cd = scanner.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno); // no를 cd 진수로 변환

            System.out.print(cd + "진수로");
            for (int i = 0; i < dno; i++){
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            System.out.print("한 번 더 할까요? (1..예/ 0..아니요) : ");
            retry = scanner.nextInt();
        }while (retry == 1);


    }
}
