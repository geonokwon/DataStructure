package training.ch04;

import java.util.Scanner;

public class IntStackTester_question_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleIntStack_question_3 s = new DoubleIntStack_question_3(64);          //최대 64개를 푸시할수 있는 스택

        while (true){
            System.out.println();
            System.out.printf("A 스택 현재 데이터 개수 : %d / %d\n", s.aSize(), s.getCapacity());
            System.out.printf("B 스택 현재 데이터 개수 : %d / %d\n", s.bSize(), s.getCapacity());
            System.out.print("(1) A푸시  (2) A팝  (3) A피크  (4) A덤프  (5) A클리어  (6) A검색\n" +
                    "(7) B푸시  (8) B팝  (9) B피크  (10) B덤프  (11) B클리어  (12) B검색  (0) 종료 : ");

            int menu = scanner.nextInt();
            if (menu == 0){
                break;
            }

            int x;
            int y;
            int numA;
            int numB;

            switch (menu) {

                //A 스택에 관련된 부분
                case 1:                             //푸시
                    System.out.print("데이터 : ");
                    x = scanner.nextInt();
                    try {
                        s.aPush(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;
                case 2:
                    try {                           //팝
                        x = s.aPop();
                        System.out.println("팝한 데이터는 " + x + " 입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 3:                             //피크
                    try {
                        x = s.aPeek();
                        System.out.println("피크한 데이터는 " + x + " 입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 4:                            //덤프
                    s.aDump();
                    break;
                case 5:                            //클리어
                    s.aClear();
                    break;
                case 6:                            //검색
                    System.out.print("찾을 요소 값 : ");
                    numA = scanner.nextInt();
                    int indexOfA = s.aIndexOf(numA);
                    if (indexOfA == -1){
                        System.out.println("그 값은 없습니다.");
                    }
                    else
                        System.out.println("그 값은 s[" + indexOfA + "] 에 있습니다.");
                    break;


                    //B 스택에 관련된 부분
                case 7:                             //푸시
                    System.out.print("데이터 : ");
                    y = scanner.nextInt();
                    try {
                        s.bPush(y);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;
                case 8:
                    try {                           //팝
                        y = s.bPop();
                        System.out.println("팝한 데이터는 " + y + " 입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 9:                             //피크
                    try {
                        y = s.bPeek();
                        System.out.println("피크한 데이터는 " + y + " 입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 10:                            //덤프
                    s.bDump();
                    break;
                case 11:                            //클리어
                    s.bClear();
                    break;
                case 12:                            //검색
                    System.out.print("찾을 요소 값 : ");
                    numB = scanner.nextInt();
                    int indexOfB = s.bIndexOf(numB);
                    if (indexOfB == -1){
                        System.out.println("그 값은 없습니다.");
                    }
                    else
                        System.out.println("그 값은 s[" + indexOfB + "] 에 있습니다.");
                    break;


            }
        }
    }
}
