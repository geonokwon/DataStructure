package training.ch04;

import java.util.Scanner;

public class DoubleRingBufferIntQueueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleRingBufferIntQueue s = new DoubleRingBufferIntQueue(64); //최대 64개를 인큐할 수 있는 큐

        while (true){
            System.out.println();           //메뉴 구분을 위한 행 추가
            System.out.printf("A큐 현재 데이터 개수 : %d / %d\n", s.sizeA(), s.getCapacity());
            System.out.printf("B큐 현재 데이터 개수 : %d / %d\n", s.sizeB(), s.getCapacity());
            System.out.print("(1) A인큐  (2) A디큐  (3) A피크  (4) A덤프  (5) A인덱스검색 (6) 클리어\n  " +
                    "(7)B인큐  (8) B디큐  (9) B피크  (10) B덤프  (11) B인덱스검색  (12) 클리어  (0) 종료  : ");


            int menu = scanner.nextInt();
            if (menu == 0){
                break;
            }

            int a;
            int b;
            switch (menu){
                //A 큐에 관련된 것
                case 1:                                 //인큐
                    System.out.print("데이터 : ");
                    a = scanner.nextInt();
                    try {
                        s.enqueA(a);
                    } catch (DoubleRingBufferIntQueue.OverflowIntQueueExcption e){
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;
                case 2:                                //디큐
                    try {
                        a = s.dequeA();
                        System.out.println("디큐 한 데이터 " + a + " 입니다.");
                    } catch (DoubleRingBufferIntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                case 3:                                 //피크
                    try {
                        a = s.peekA();
                        System.out.println("피크한 데이터는 " + a + " 입니다.");
                    } catch (DoubleRingBufferIntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                case 4:                                 //덤프
                    s.dumpA();
                    break;
                case 5:                                 //인덱스검색
                    try {
                        System.out.print("검색할 값 : ");
                        int y = scanner.nextInt();
                        int result = s.indexOfA(y);
                        System.out.println("그 값은 s[" + result + "]에 있습니다.");
                    } catch (DoubleRingBufferIntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어 있습니다.");
                    }
                case 6:
                    s.clearA();
                    break;

                    //B 큐에 관련된 것
                case 7:                                 //인큐
                    System.out.print("데이터 : ");
                    b = scanner.nextInt();
                    try {
                        s.enqueB(b);
                    } catch (DoubleRingBufferIntQueue.OverflowIntQueueExcption e){
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;
                case 8:                                //디큐
                    try {
                        b = s.dequeB();
                        System.out.println("디큐 한 데이터 " + b + " 입니다.");
                    } catch (DoubleRingBufferIntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                case 9:                                 //피크
                    try {
                        b = s.peekB();
                        System.out.println("피크한 데이터는 " + b + " 입니다.");
                    } catch (DoubleRingBufferIntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                case 10:                                 //덤프
                    s.dumpB();
                    break;
                case 11:                                 //인덱스검색
                    try {
                        System.out.print("검색할 값 : ");
                        int y = scanner.nextInt();
                        int result = s.indexOfB(y);
                        System.out.println("그 값은 s[" + result + "]에 있습니다.");
                    } catch (DoubleRingBufferIntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어 있습니다.");
                    }
                case 12:
                    s.clearB();
                    break;
            }
        }
    }
}
