package doit.chap3.실습;

//제너릭 클래스 구현

public class ThreeCToThree {
    static class GenericClass<T> {
        private T xyz;

        public GenericClass(T t) {
            this.xyz =t;
        }

        T getXyz() {
            return xyz;
        }
    }

    public static void main(String[] args) {
        GenericClass<String> s= new GenericClass<>("ABC");
        GenericClass<Integer> n= new GenericClass<>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());

    }
}
