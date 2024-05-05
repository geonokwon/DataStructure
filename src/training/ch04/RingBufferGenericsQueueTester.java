package training.ch04;

import java.util.Scanner;

public class RingBufferGenericsQueueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RingBufferGenericsQueue<String> s = new RingBufferGenericsQueue<String>(64); //최대 64개를 인큐할 수 있는 큐

        while (true){
            System.out.println();           //메뉴 구분을 위한 행 추가
            System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 인큐  (2) 디큐  (3) 피크  (4) 덤프  (5) 검색  (0) 종료  : ");


            int menu = scanner.nextInt();
            if (menu == 0){
                break;
            }

            String x;
            switch (menu){
                case 1:                                 //인큐
                    System.out.print("데이터 : ");
                    x = scanner.next();
                    try {
                        s.enque(x);
                    } catch ( RingBufferIntQueue.OverflowIntQueueExcption e){
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;

                case 2:                                //디큐
                    try {
                        x = s.deque();
                        System.out.println("디큐 한 데이터 " + x + " 입니다.");
                    } catch (RingBufferGenericsQueue.EmptyGQueueException e){
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                case 3:                                 //피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + " 입니다.");
                    } catch (RingBufferGenericsQueue.EmptyGQueueException e){
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                case 4:                                 //덤프
                    s.dump();
                    break;
                case 5:                                 //검색
                    try {
                        System.out.print("검색할 값 : ");
                        String y = scanner.next();
                        int result =  s.search(y);
                        System.out.println("그 값은 : " + result + "에 있습니다.");
                    } catch (RingBufferGenericsQueue.EmptyGQueueException e){
                        System.out.println("큐가 비어 있습니다.");
                    }

            }
        }
    }
}
