package training.ch01;

import java.util.Scanner;

public class T_1_16_question_1 {
    public static void main(String[] args) {
        System.out.print("몇단까지 출력할 것인가요 ? : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            if (i == 1){
                for (int k = 1; k <= n; k++){
                    if (k == 1){    // k가 1이면 공백 3칸에 "|"추가한다 구분하기위해
                        System.out.print("   |");
                    }
                    System.out.printf("%3d", k); // 공백 정령 3자리 정수표기 1~n까지 표시함 행 표시하기 위한것
                }
                System.out.println();   // 줄바꿈
                System.out.print("---+"); //초기에 행열 구분하기위한 공백부분
                System.out.println("---".repeat(n)); //행의 구분을 위한것으로 "---" 3자리로 행의 숫자아래쪽에 같은 자리로 들어가게됨
            }
            for (int j = 1; j <= n; j++){
                if (j == 1){
                    System.out.print(" " + i + " |"); // 열의 시작마다 한번더 출력하며 "|" 구분선 표시
                }
                System.out.printf("%3d", i * j); // 구구단 내용 표시
            }
            System.out.println();
        }

        // 문제가 있음 3자리수가 넘어가면 표의 형태가 깨져버림 .. 어떻게하면 해결할수 있을까 ..
    }
}
