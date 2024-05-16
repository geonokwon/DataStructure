package training.ch05;


//각 열에 퀸 1개를 배치하는 조합을 재귀적으로 나열
public class T_5_8 {
    static int[] pos = new int[8];      //각 열에 있는 퀸의 위치

    //각 열에 있는 퀸의 위치를 출력
    static void print(){
        for (int i = 0; i < 8; i++){
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }

    //i열에 퀸을 배치
    static void set(int i){
        for (int j = 0; j < 8; j++){
            pos[i] = j;     //퀸을 j행에 배치
            if (i == 7){    //모든 열에 배치
                print();
            }
            else {
                set(i + 1); //다음 열에 퀸을 배치
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }

}
