package training.ch05;

import java.util.Scanner;

//꼬리 재귀의 제거
public class T_5_4 {

    //꼬리 재귀를 제거
    static void recur(int n){
        while (n > 0){
            recur(n - 1);
            System.out.println(n);
            n = n - 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력 하세요 : ");
        int x = scanner.nextInt();

        recur(x);
    }
}
