package training.ch03;

import java.util.Scanner;

public class T_3_2 {

    static int seqSearch(int[] a, int n, int key){ //for 문으로 배열 탐색 while 문보다 간결함!.
      for (int i = 0; i < n; i++){
          if (a[i] == key){ //검색 성공 return i를 반환
              return i;
          }
      }
        return -1; //검색 실패 return -1 반환
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = scanner.nextInt();
        int[] x = new int[num];   //요솟수가 num인 배열

        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }
        System.out.print("검색할 값: "); //키 값을 입력받음
        int ky = scanner.nextInt();
        int idx = seqSearch(x, num, ky);

        if (idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        }
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}
