package training.ch05;


import java.util.Scanner;

//팩토리얼 값을 재귀메서드 호출을 사용하지 않고 작성해보기
public class T_5_1_question_1 {
    static int factorial(int n){
        for (int i = n - 1;  i > 0; i--){       // i가 i-1 인 i부터  n에 i를 곱하여 저장한다 그리고 i 가 0 보다 작으면 멈춘다.
           n *= i;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = scanner.nextInt();

        System.out.println(x + " 의 팩토리얼은 " + factorial(x) + " 입니다.");
    }
}
