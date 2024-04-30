package training.ch01;

import java.util.Scanner;

public class T_1_16_question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("변의 길이: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
