package training.ch03;

import java.util.Arrays;
import java.util.Scanner;
public class T_3_4_question_2 {
    static int binSearch(int[] a, int n, int key){
        int pl = 0;
        int pr = n - 1;

        String[] select = new String[n];        //현재 검색 범위를 표시하기 위한 배열


        for (int j = 0; j < n; j++) {           //배열의 인덱스 열을 표시
            if (j == 0){
                System.out.print("   |");
            }
            System.out.printf("%3d", j);
            select[j] = "   ";
            if (j == n - 1){                    //배열의 인덱스 열을 표시후 마지막에 구분선 표시
                System.out.println("\n---+" + "---".repeat(n)); //아랫줄 표 출력 n값의 크기만큼 출력함
            }
        }

        for (int i = 0; i < n; i++){
            Arrays.fill(select, "   ");     //select 배열의 초깃값으로 "   " 을 설정 한다.

            int pc = (pl + pr) / 2;             //중앙 요소의 인덱스
            select[pl] = " <- ";                //select[pl]번째에 " <- "값을 넣어준다
            select[pr] = " ->";                 //select[pr]번째에 " ->"값을 넣어준다
            select[pc] = " + ";                 //select[pc]번째에 " + "값을 넣어준다
            if (pl == pc || pr == pc){
                select[pc] = "  + ";
            }

            for (int j = 0; j < n; j++){        //select 배열을 먼저 출력한다 이진검색 범위 표시
                if (j == 0){
                    System.out.print("   |");   //시작할때의 표의 처음에 만 표시한다.
                }
                System.out.printf("%3s", select[j]);
            }

            for (int j = 0; j < n; j++){
                if (j == 0){
                    System.out.printf("\n%3d|", pc);    //행의 맨 왼쪽에 현재 선택한 요소의 인덱스를 표시
                }
                System.out.printf("%3d", a[j]);         //행에 a 배열 요소 전체 출력
                if (j == n - 1){
                    System.out.println();
                }
            }

            if (a[pc] == key) {                 //중앙 요소의 인덱스가 key 인 경우 중앙요소 반환 -- 검색성공!
                return pc;
            }
            else if (a[pc] < key) {             //중앙 요소의 인덱스 보다 key 값이 큰경우
                pl = pc + 1;                    //pl의 위치를 중앙요소 인덱스 보다 한칸더 오른쪽으로 이동시킨다
            }
            else {                              //중앙 요소의 인덱스 보다 key 값이 작은경우
                pr = pc - 1;                    //맨끝 요소의 인덱스를 중앙 요소 인덱스 보다 한칸더 왼쪽으로 이동시킨다
            }

        }

        return -1;                              //전체 배열 순회후 key값과 일치하는 값이 없는경우 -1반환 -- 검색실패!
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];         //요솟수가 num 인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : ");     //오름차순으로 정렬해야 하기 때문에 기준이 되는 0번의 값을 받음
        x[0] = scanner.nextInt();

        for (int i = 1; i < num; i++){
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = scanner.nextInt();
            } while (x[i] < x[i - 1]);      //입력받은 요소가 0번 인덱스의 요소값 보다 적으면 다시 실행.
        }
        System.out.print("검색할 값 : ");     //ky값 입력받음
        int ky = scanner.nextInt();

        int idx = binSearch(x, num, ky);    //배열 x에서 값이 ky인 요소를 검색

        if (idx == -1){
            System.out.println("\n그 값의 요소가 없습니다.");
        }
        else
            System.out.println("\n그 값은 x[" + idx + "]에 있습니다.");
    }
}
