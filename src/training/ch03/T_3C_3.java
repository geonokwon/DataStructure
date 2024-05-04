package training.ch03;

public class T_3C_3 {
    static class GenericClass<T> {
        private T xyz;
        GenericClass(T t){      //생성자
            this.xyz = t;
        }
        T getXyz(){             //xyz getter
            return xyz;
        }
    }
    public static void main(String[] args) {
        //다음과 같이 매개변수에 String 을 넘길 수도 있고 integer 를 넘길수도 있음
        GenericClass<String> s = new GenericClass<String>("abc");
        GenericClass<Integer> n = new GenericClass<Integer>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}
