package training.ch05;

public class T_5_10_question_1 {
    static boolean[] flag_a = new boolean[8];        //각 행에 퀸을 배치했는지 체크
    static boolean[] flag_b = new boolean[15];       // / 대각선 방향으로 퀸을 배치했는지 체크
    static boolean[] flag_c = new boolean[15];       // \ 대각선 방향으로 퀸을 배치했는지 체크
    static int[] pos = new int[8];                   // 각 열에 있는 퀸의 위치

    //각 열에 있는 퀸의 위치를 출력
    static void print(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                System.out.printf("%s", j == pos[i] ? "■" + " " : "□" + " "); //삼항 조건으로 체크후 pos[i] 가 true 인지 false 인지 확인
            System.out.println();
        }
        System.out.println();
    }

    //i열의 알맞은 위치에 퀸을 배치
    static void set(int i){
        for (int j = 0; j < 8; j++){
            if (flag_a[j] == false &&       //가로(j행)에 아직 배치하지 않음
            flag_b[i + j] == false &&       // / 대각선에 아직 배치하지 않음
            flag_c[i - j + 7] == false){    // \ 대각선에 아직 배치하지 않음
                pos[i] = j;                 //퀸을 j행에 배치
                if (i == 7){
                    print();
                }
                else {
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                    set(i + 1);
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        set(0);
    }
}
