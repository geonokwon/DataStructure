package training.ch05;

import java.util.Scanner;

public class T_5_6_question_1 {

    static String[] memo;
    static int countA = 0;
    static int countB = 0;

    static void recur(int n){
        countA++;
        if (n > 0){
            recur(n - 1);
            recur(n - 2);
        }
    }

    //메모화를 도입한 recur 메서드
    static void recurMemo(int n){
        if (memo[n + 1] != null){
            countB++;
        }
        else {
            if (n > 0){
                countB++;
                recurMemo(n - 1);
                recurMemo(n - 2);
                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1]; //메모화
            }
            else {
                countB++;
                memo[n + 1] = "";       //메모화: recur(0) 과 recur(-1)은 빈 문자열
            }
        }
    }
    public static void main(String[] args) {
        int x;
        for (x = 1; x < 11; x++){
            if (x == 1){
                System.out.print("   단계  : ");
                for (int j = 1; j < 11; j++){
                    System.out.printf("%4d", j);
                }
                System.out.println();
                System.out.print("처음 버전 : ");
            }
            recur(x);
            System.out.printf("%4s", countA);
            countA = 0;
        }
        for (x = 1; x < 11; x++){
            if (x == 1){
                System.out.print("\n" + "메모 버전 : ");
            }
            memo = new String[x + 2];
            recurMemo(x);
            System.out.printf("%4s", countB);
            countB = 0;
        }



    }

}
