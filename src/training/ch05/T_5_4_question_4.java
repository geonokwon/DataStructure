package training.ch05;


//상향식 분석 , 하향식 분석 해보기
public class T_5_4_question_4 {
    static void recur2(int n){
        if(n > 0){
            recur2(n - 2);
            System.out.println(n);
            recur2(n - 1);
        }
    }

    //int n = 4 를 가정 (상향식 분석)
    //recur2(1) : recur2(-1) 1 recur2(0) => 1
    //recur2(2) : recur2(0)  2 recur2(1) => 2, 1
    //recur2(3) : recur2(1)  3 recur2(2) => 1, 3, 2, 1
    //recur2(4) : recur2(2)  4 recur2(3) => 2, 1, 4, 1, 3, 2, 1
    //출력된 값은 :2, 1, 4, 1, 3, 2, 1 <<

    //int n = 4 를 가정 (하향식 분석)
    //recur2(2)  4  recur2(3)   => 2, 1, 1, 3, 2, 1 << c

    //recur2(2) : recur2(0)  2  recur2(1)   => 2, 1
    //recur2(1) : recur2(-1) 1  recur2(0)   => 1
    //recur2(3) : recur2(1)  3  recur2(2)   => 1, 3, 2, 1
    //recur2(1) : recur2(-1) 1  recur2(0)   => 1

    //recur2(2) : recur(0)   2  recur2(1)   => 2, 1
    //recur2(1) : recur(-1)  1  recur2(0)   => 1


    public static void main(String[] args) {
        recur2(4);
    }
}
