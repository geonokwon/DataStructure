package training.ch02;

import java.util.Arrays;

public class T_2C_1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = a.clone(); //b는 a의 복제를 참조

        b[3] = 0;

        System.out.println("a = " + Arrays.toString(a));
        System.out.println("b = " + Arrays.toString(b));

    }
}
