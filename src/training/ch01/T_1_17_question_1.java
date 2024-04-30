package training.ch01;

import java.util.Scanner;

public class T_1_17_question_1 {
    static void triangleLB(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangleLU(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangleRU(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(i));
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangleRB(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            System.out.print("*".repeat(i));
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        triangleLB(n);
        triangleLU(n);
        triangleRU(n);
        triangleRB(n);
    }
}
