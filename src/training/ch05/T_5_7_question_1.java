package training.ch05;

import java.util.Arrays;
import java.util.Scanner;

public class T_5_7_question_1 {
    static String[] memo;                                   //n 값을 담을 배열을 생성한다.
    static void recur3(int n){
        //비 재귀적으로 구현하기
        memo = new String[n + 2];                           //i가 2부터 시작하므로 n + 2 만큼의 크기의 배열을 만든다
        Arrays.fill(memo, "");                          //memo 배열을 ""으로 초기화

        for (int i = 2, k = 1; i < n + 2; i++, k++){        //i가 2부터 시작하기 때문에 n + 2 만큼 돌아야 한다.
            memo[i] = memo[i - 1] + memo[i - 2] + k;        //k는 n의 1부터 부터 n 까지를 돈다
                                                            //memo 에 i-1 + i-2 + k 를 하면 == recur(n-1),recur(n-2),print(n)
        }
        for (int i = 0; i < memo[n + 1].length(); i++) {    //메모배열의 마지막 값의 자릿수 만큼 돌아야 한다.
            char a = memo[memo.length - 1].charAt(i);       //메모배열의 마지막 값의 자릿수를 하나씩 출력한다
            System.out.println(a);                          //아래 상향식의 결과 값과 같은것을 확인할 수 있다.
        }

        //recur3(int n)
        //if(n > 0) 일때 recur3(n-1) recur3(n-2) print(n)
        //------------------------------------------------
        //int n = 4 를 가정 (상향식 분석)
        //recur2(1) : recur2(0)  recur2(-1)  1  => 1
        //recur2(2) : recur2(1)  recur2(0)   2  => 1, 2
        //recur2(3) : recur2(2)  recur2(1)   3  => 1, 2, 1, 3
        //recur2(4) : recur2(3)  recur2(2)   4  => 1, 2, 1, 3, 1, 2, 4
        //출력된 값은 :1, 2, 1, 3, 1, 2, 4 <<
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = scanner.nextInt();
        recur3(n);
    }
}
