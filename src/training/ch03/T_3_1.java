package training.ch03;

import java.util.Scanner;

public class T_3_1 {

    static int seqSearch(int[] a, int n, int key){
        int i = 0;

        while (true){
            if (i == n){
                return  -1; //검색실패 하여 -1을 반환
            }
            if (a[i] == key){
                return i;  //검색성공 인텍스를 반환
            }
            i++;
        }
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
