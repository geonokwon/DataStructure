package training.ch03;

import java.util.Scanner;

public class T_3_3_question_2 {
    static int seqSearch(int[] a, int n, int key){
        System.out.print("   |");                                   //구분 표시

        for (int i = 0; i < n; i++){
            System.out.printf("%3d", i);                            //인덱스를 표현하는 열을 3자리로 표현 인덱스 숫자는 배열의 크기만큼 표시
        }
        System.out.print("\n---+" + "---".repeat(n) + "\n");        //구분 표시 선 배열의 크기만큼 생성!

        for (int i = 0, k = 2; i < n; i++, k += 3){                 //현재 포인터를 표시하는 별표 앞의 공백의 칸수를 처음에는 2칸 그다음부터는 3칸씩 늘어나야 함
            System.out.printf("   |%"+ k + "s*\n%3d|", " ", i);     //포인터를 k 만큼 공백으로 표시하고 다음줄에 현재 인덱스 행 값 표시
            for (int j : a){
                System.out.printf("%3d", j);                        //현재 배열의 전체 인덱스 값을 3자리로 표현함
            }
            if (a[i] == key){                                       //검색 성공 return i를 반환
                return i;
            }
            System.out.printf("\n%3s|\n"," ");                      //한번 배열을 전부 순회하고 출력한 후 줄바꿈 해줌.
        }
        return -1;                                                  //검색 실패 return -1 반환
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num];                                      //요솟수가 num인 배열

        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }
        System.out.print("검색할 값: ");                                //키 값을 입력받음
        int ky = scanner.nextInt();
        int idx = seqSearch(x, num, ky);

        if (idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        }
        else
            System.out.println("\n그 값은 x[" + idx + "]에 있습니다.");
    }
}
