package training.ch05;

import java.util.Scanner;

public class T_5_6 {
    //재귀 함수를 메모화로 구현
    static String[] memo;


    //메모화를 도입한 recur 메서드
    static void recur(int n){

        if (memo[n + 1] != null){
            System.out.print(memo[n + 1]); //메모를 출력
        }
        else {
            if (n > 0){
                recur(n - 1);
                System.out.println(n + " 여기 ");
                recur(n - 2);
                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1]; //메모화

                //n = 1 => memo[2] => null + 1 +  null = 1
                //n = 2 => memo[3] => 12 + null = 12
                //n = 3 => memo[4] => 12 + 3 + 1 = 1231
                //n = 4 => memo[5] => 1 + 2 + 3 + 1 + 4 + 1 + 2 = 1231412
            }
            else {
                memo[n + 1] = "";       //메모화: recur(0) 과 recur(-1)은 빈 문자열
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력 하세요 : ");
        int x = scanner.nextInt();

        memo = new String[x + 2];
        recur(x);
    }
}
