package training.ch01;

public class T_1_2_question {
    static int mid3 (int a, int b, int c){
        //같거나 클때 조건
        if(a >= b){
            if(b >= c) return b;
            else if (a <= c) return a;
            else return c;
        }
        //크기만 할때 조건
        else if (a > c) return a;
        else if (b > c) return c;
        else return b;
    }
    public static void main(String[] args) {
        System.out.println("mid : (3, 2, 1) = " + mid3(3, 2, 1));
        System.out.println("mid : (3, 2, 2) = " + mid3(3, 2, 2));
        System.out.println("mid : (3, 1, 2) = " + mid3(3, 1, 2));
        System.out.println("mid : (3, 2, 3) = " + mid3(3, 2, 3));
        System.out.println("mid : (2, 1, 3) = " + mid3(2, 1, 3));
        System.out.println("mid : (3, 3, 2) = " + mid3(3, 3, 2));
        System.out.println("mid : (3, 3, 3) = " + mid3(3, 3, 3));
        System.out.println("mid : (2, 2, 3) = " + mid3(2, 2, 3));
        System.out.println("mid : (2, 3, 1) = " + mid3(2, 3, 1));
        System.out.println("mid : (2, 3, 2) = " + mid3(2, 3, 2));
        System.out.println("mid : (1, 3, 2) = " + mid3(1, 3, 2));
        System.out.println("mid : (2, 3, 3) = " + mid3(2, 3, 3));
        System.out.println("mid : (1, 2, 3) = " + mid3(1, 2, 3));
    }
}
