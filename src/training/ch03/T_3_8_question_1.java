package training.ch03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class T_3_8_question_1 {
    //신체검사 데이터를 정의
    static class PhyscData{
        private String name;    //이름
        private int height;     //키
        private double vision;  //시력

        //생성자

        public PhyscData(String name, int height, double vision){
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        //문자열로 만들어 반환하는 메서드
        public String toString(){
            return name + " " + height + " " + vision;
        }

        //키의 오름차순으로 정렬하기 위한 comparator
        public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();
        public static class VisionOrderComparator implements Comparator<PhyscData>{
            public int compare(PhyscData d1, PhyscData d2){
                return (d1.vision < d2.vision) ? 1 :
                        (d1.vision > d2.vision) ? -1 : 0;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            PhyscData[] x = {                                           //시력의 내림 차순으로 정렬
                    new PhyscData("박준서", 175, 2.0),
                    new PhyscData("유서범", 171, 1.5),
                    new PhyscData("장경오", 174, 1.2),
                    new PhyscData("황지안", 169, 0.8),
                    new PhyscData("김찬우", 173, 0.7),
                    new PhyscData("이수연", 168, 0.4),
                    new PhyscData("강민하", 162, 0.3),
            };
            System.out.print("시력이 몇인 사람을 찾고 있나요? : ");
            double vision = scanner.nextDouble();                         //시력 값 입력받음
            int idx = Arrays.binarySearch(
                    x,                                              //배열 x 에서
                    new PhyscData("", 0, vision),      //시력이 vision 인 요소를
                    PhyscData.VISION_ORDER);                        //HEIGHT_ORDER 에 의해 검색

            if (idx < 0){
                System.out.println("그 값은 요소가 없습니다.");
            }
            else{
                System.out.println("그 값은 x[" + idx + "]에 있습니다.");
                System.out.println("찾은 데이터 : " + x[idx]);
            }


        }
    }
}
