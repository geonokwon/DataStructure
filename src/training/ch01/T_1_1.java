package training.ch01;

public class T_1_1 {
    static int max3(int a, int b, int c){ //3개의 정수값 중 최댓값을 구하여 출력.
        int max = a; //최댓값
        if (max < b) max = b;
        if (max < c) max = c;
        return max; //구한 최댓값을 호출한 곳으로 반환
    }
    public static void main(String[] args) {
        System.out.println("max : (3, 1, 2) = " + max3(3, 1, 2));
        System.out.println("max : (3, 2, 1) = " + max3(3, 2, 1));
        System.out.println("max : (3, 2, 2) = " + max3(3, 2, 2));
        System.out.println("max : (3, 2, 3) = " + max3(3, 2, 3));
        System.out.println("max : (2, 1, 3) = " + max3(2, 1, 3));
        System.out.println("max : (3, 3, 2) = " + max3(3, 3, 2));
        System.out.println("max : (3, 3, 3) = " + max3(3, 3, 3));
        System.out.println("max : (2, 2, 3) = " + max3(2, 2, 3));
        System.out.println("max : (2, 3, 1) = " + max3(2, 3, 1));
        System.out.println("max : (2, 3, 2) = " + max3(2, 3, 2));
        System.out.println("max : (1, 3, 2) = " + max3(1, 3, 2));
        System.out.println("max : (2, 3, 3) = " + max3(2, 3, 3));
        System.out.println("max : (1, 2, 3) = " + max3(1, 2, 3));
    }
}
