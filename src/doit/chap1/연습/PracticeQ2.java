package doit.chap1.연습;

//세 값의 최솟값을 구하는 메서드를 작성하세요

public class PracticeQ2 {
    static int Min(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(Min(1,2,3));
    }
}
