package training.ch01;

import java.util.Scanner;

public class T_1_2 {
    static int mid3 (int a, int b, int c){
        //같거나 클때 조건
        if(a >= b){
            if(b >= c) return b;
            else if (a <= c) return a;
            else return c;
        }
        //크기만 할때 조건
        else if (a > c) return a;
        else if (b > c) return c;
        else return b;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a의 값: ");
        int a = stdIn.nextInt();
        System.out.print("b의 값: ");
        int b = stdIn.nextInt();
        System.out.print("c의 값: ");
        int c = stdIn.nextInt();

        System.out.println("중앙값은 " + mid3(a, b, c) + "입니다.");
    }
}
