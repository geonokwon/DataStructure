package training.ch04;

import java.util.Scanner;

public class IntArrayQueueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntArrayQueue s = new IntArrayQueue(10);
        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 인큐  (2)디큐  (3)덤프  (4)클리어  (0)종료  : ");
            int menu = scanner.nextInt();

            if (menu == 0) {
                break;
            }
            int x;
            switch (menu) {
                case 1 :                    //인큐
                    System.out.print("데이터 : ");
                    x = scanner.nextInt();
                    s.enQueue(x);
                    break;
                case 2:                     //디큐
                    int deQueue = s.deQueue();
                    if (deQueue > 0) {
                        System.out.println("디큐 한 데이터는 : " + deQueue + " 입니다.");
                    }
                    break;
                case 3:                     //덤프
                    s.dump();
                    break;
                case 4:
                    s.clear();              //클리어
                    break;
            }

        }
    }
}
