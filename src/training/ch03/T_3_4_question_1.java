package training.ch03;

import java.util.Scanner;

public class T_3_4_question_1 {
    static int searchIdx(int[] a, int n, int key, int[] idx){  //key 값과 일치하는 a 배열의 요소의 인덱스 값을 idx 배열에 추가
        int count = 0;                                         //a 배열의 key 값과 일치하는 요소를 idx 배열에 넣을때 카운트
        for (int i = 0, j = 0; i < n; i++){
            if (a[i] == key){                                  //a 배열을 순회하면서 key 값과 같은 조건이면
                idx[j] = i;                                    //a 배열의 i번 인덱스를 idx 배열의 j 인덱스에 i 를 저장
                System.out.println("idx[" + j + "] : " +  i);  //출력
                j++;                                           //idx 인덱스를 다음칸으로 옮겨준다
                count++;                                       //일치하는 값이 있기때문에 카운트 증가시켜준다
            }
        }
        if (count == 0){                                        //카운트가 0이면 일치하는 값이 없으므로 -1 반환
            return -1;
        }
        else
            return count;                                       //일치하는 값이 있다면 몇개가 일치하는지를 반환
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num];
        int[] result = new int[num];

        for (int i = 0; i < num; i++){
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }
        System.out.print("검색할 값 : ");
        int ky = scanner.nextInt();
        int idx = searchIdx(x, num, ky, result);
        System.out.println("검색결과와 일치하는 갯수는 : " + idx + " 입니다.");
    }
}
