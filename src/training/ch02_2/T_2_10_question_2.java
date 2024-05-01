package training.ch02_2;

import java.util.Scanner;

public class T_2_10_question_2 {
    static class YMD{
        int y;      //년도를 표기
        int m;      //달을 표기
        int d;      //일을 표기
        YMD(int y, int m, int d){
            this.y = y;
            this.m = m;
            this.d = d;
        }
        static void after(YMD[] dat, int n){        //n일 뒤를 계산
            dat[0].d += n;

            if (dat[0].d > 31) {            //일 이 31일 이상이면 월에 +1 해주고 일은 31일을 빼준다.
                while (dat[0].d > 31) {
                    dat[0].d -= 31;
                    dat[0].m += 1;
                    }
                if (dat[0].d == 0){         //일 이 0이 될경우 1일로 바꾸어 준다.
                    dat[0].d = 1;
                }
            }
            if (dat[0].m > 12) {            //월이 12월 이상인 경우 년에 1더해주고 월은 12빼준다.
                 while (dat[0].m > 12){
                     dat[0].m -= 12;        //월은 일에서 1을 더해주고 있으므로 0이 될 가능성은 없다.
                     dat[0].y += 1;         //그러므로 0에 대한 처리를 하지 않는다.
                }
            }
        }
        static void before(YMD[] dat, int n){       //n일 전을 계산
            dat[0].d -= n;
            if (dat[0].d < 1) {             //-n 일이 되면 일에 31을 더해주고 월에 1을 빼준다.
                while (dat[0].d < 1) {      // 일이 1보다 작을 경우이기 때문에 0이 될 가능성이 없다.
                    dat[0].d += 31;
                    dat[0].m -= 1;
                }
            }
            if (dat[0].m < 1) {             //월이 1보다 작을 경우 년을 1년 빼주고 12월을 더해준다
                while (dat[0].m < 1) {
                    dat[0].m += 12;
                    dat[0].y -= 1;
                }
            }
        }
        public static void main(String[] args) {

            //모든 달의 기준을 31일로 작성하였음

            Scanner scanner = new Scanner(System.in);
            int i = 0;
            do {
                System.out.println("현재의 년,월,일 을 작성하세요 (띄워쓰기로 구분해 주세요)");
                YMD[] x = { new YMD(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()) };
                System.out.print("n일 전이 궁금하시다면 (0) / n일 후가 궁금하시다면 (1) : ");
                int bool = scanner.nextInt();

                // n일 전 (before)
                if (bool == 0){
                    System.out.print("몇일 전의 날짜가 궁금하신가요? : ");
                    int before = scanner.nextInt();
                    before(x, before);
                    System.out.printf("%4d. %02d. %02d.\n", x[0].y, x[0].m, x[0].d);

                }

                // n일 후 (after)
                if (bool == 1){
                    System.out.print("몇일 뒤의 날짜가 궁금하신가요? : ");
                    int after = scanner.nextInt();
                    after(x, after);
                    System.out.printf("%4d. %02d. %02d.\n", x[0].y, x[0].m, x[0].d);
                }

                //다시 돌아가는 부분
                System.out.print("처음으로 돌아가시겠습니까? yes(0) / no(1) : ");
                i = scanner.nextInt();
            }while (i < 1);
        }
    }
}
