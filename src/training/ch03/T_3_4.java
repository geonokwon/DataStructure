package training.ch03;

import java.util.Scanner;

public class T_3_4 {

    //요솟수가 n개인 배열 a에서 key와 같은 요소를 이진 검색
    static int binSearch(int[] a, int n, int key){
        int pl = 0;             //검색 범위의 첫 인덱스
        int pr = n - 1;         //검색 범위의 끝 인덱스

        do {
            int pc = (pl + pr) / 2; //중앙 요소의 인덱스
            if (a[pc] == key){      //검색 성공!
                return pc;
            }
            else if (a[pc] < key){  //key값이 중앙 요소의 인데스 보다 큰 경우 pl첫 인덱스를 중앙에서 +1로 옮긴다.
                pl = pc + 1;
            }
            else {                  //key값이 중앙 요소의 인데스 보다 작은 경우 pr끝 인덱스를 중앙에서 -1로 옮긴다.
                pr = pc - 1;
            }
        } while (pl <= pr); //pl 과 pr 의 값이 바뀌는 순간은 원하는값이 없으므로 while문 종료 후 -1 반환

        return -1; //검색 실패!
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];         //요솟수가 num인 배열

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
            System.out.println("그 값의 요소가 없습니다.");
        }
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}
