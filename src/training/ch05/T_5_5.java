package training.ch05;

import training.ch04.IntStack;

import java.util.Scanner;

//재귀를 제거
public class T_5_5 {

    //재귀를 제거
    static void recur(int n){
        IntStack s = new IntStack(n);

        while (true){
            if (n > 0){
                s.push(n);      //n값을 푸쉬
                n = n - 1;
                continue;
            }
            if (s.isEmpty() != true){       //스택이 비어 있지 않으면
                n = s.pop();                //저장하고 있던 스택값을 팝
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }

    }
    //1. 처음 if 조건이 true 이므로 4, 3, 2, 1을 스택에 저장              (4,3,2,1)
    //1. 처음 if 조건이 true 이므로 4, 3, 2, 1을 스택다 저장              (4,3,2,1)
    //2. 처음 if 조건이 false 이므로 두번째 if 실행 1을 팝 > 1 - 2 = - 1   (4,3,2)
    //3. 처음 if 조건이 false 이므로 두번째 if 실행 2를 팝 > 2 - 2 = 0     (4,3)
    //4. 처음 if 조건이 false 이므로 두번째 if 실행 3을 팝 > 3 - 1 = 1     (4)
    //5. 처음 if 조건이 true 이므로 첫번쨰 if 실행 1을 스택에 저장           (4,1)
    //6. 처음 if 조건이 false 이므로 두번째 if 실행 1을 팝 > 1 - 2 = -1    (4)
    //7. 처음 if 조건이 false 이므로 두번째 if 실행 4를 팝 > 4 - 2 = 2     ( )
    //8. 처음 if 조건이 true 이므로 2, 1 을 스택에 저장                    (2,1)
    //9. 처음 if 조건이 false 이므로 두번째 if 실행 1를 팝 > 1 - 2 = -1    (2)
    //10. 처음 if 조건이 false 이므로 두번째 if 실행 2을 팝 > 2 - 2 = 0    ( )
    //11. 처음 if 조건이 false 이고 두번쨰 if 조건도 false 이므로 break
    //result = 팝 했을때만 출력했으니까 > 1, 2, 3, 1, 4, 1, 2


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력 하세요 : ");
        int x = scanner.nextInt();

        recur(x);
    }
}
