package doit.chap1.실습;

//한꺼번에 정수들을 받아서 최대값 구하기

public class OneToTwo {

    static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(max(1,2,3));

    }
}
