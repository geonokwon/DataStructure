package training.ch04;

import java.util.Scanner;

public class IntStackTester_question_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntStack s = new IntStack(64);          //최대 64개를 푸시할수 있는 스택

        while (true){
            System.out.println();
            System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 푸시  (2) 팝  (3) 피크  (4) 덤프  (5)클리어  (6)검색\n(7)스택이 비어있는지?  (8)스택이 가득 차있는지? (0)종료 : ");

            int menu = scanner.nextInt();
            if (menu == 0){
                break;
            }

            int x;
            int num;
            switch (menu) {
                case 1:                             //푸시
                    System.out.print("데이터 : ");
                    x = scanner.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;
                case 2:
                    try {                           //팝
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + " 입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 3:                             //피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + " 입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 4:                            //덤프
                    s.dump();
                    break;
                case 5:                            //클리어
                    s.clear();
                    break;
                case 6:                            //검색
                    System.out.print("찾을 요소 값 : ");
                    num = scanner.nextInt();
                    int indexOf = s.indexOf(num);
                    if (indexOf == -1){
                        System.out.println("그 값은 없습니다.");
                    }
                    else
                        System.out.println("그 값은 s[" + indexOf + "] 에 있습니다.");
                    break;
                case 7:
                    System.out.print("스택이 비어 있습니까 ?");
                    if (!s.isEmpty())
                        System.out.println(" 아니요.");
                    else
                        System.out.println(" 예");

                    break;
                case 8:
                    System.out.print("스택이 가득 차있습니까 ?");
                    if (!s.isFull()){
                        System.out.println(" 아니요");
                    }
                    else
                        System.out.println(" 예");
            }
        }
    }
}
