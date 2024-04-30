package training.ch01;

import java.util.Scanner;

public class T_1_17_question_2 {
   static void spira(int n){
       for (int i = 1; i <= n; i++){
           for (int k = n; k > i; k--){
               System.out.print(" ");
           }
           for (int j = 1; j <= (i - 1) * 2 + 1; j++){
               System.out.print("*");
           }
           System.out.println();
       }
   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        spira(n);

    }
}
