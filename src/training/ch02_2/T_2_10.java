package training.ch02_2;

import java.util.Scanner;

public class T_2_10 {
    static final int VMAX = 21;

    static class PhyscData{
        String name;        //이름
        int height;         //키
        double vision;      //시력

        //생성자
        PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
        //키의 평균값을 구함
        static double aveHeight(PhyscData[] dat){
            double sum = 0;
            for (int i = 0; i < dat.length; i++){
                sum += dat[i].height;
            }
            return sum / dat.length;
        }
        //시력 분포를 구함
        static void distVision(PhyscData[] dat, int[] dist){
            int i = 0;
            dist[i] = 0;
            for (i = 0; i < dat.length; i++){
                if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX /10.0){
                    dist[(int)(dat[i].vision * 10)]++;
                }
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            PhyscData[] x = {
                    new PhyscData("강민하", 162, 0.3),
                    new PhyscData("강민하", 162, 0.3),
                    new PhyscData("강민하", 162, 0.3),
                    new PhyscData("강민하", 162, 0.3),
                    new PhyscData("강민하", 162, 0.3),
                    new PhyscData("강민하", 162, 0.3),
                    new PhyscData("강민하", 162, 0.3),
            };
        }



ㅣ




    }
}
