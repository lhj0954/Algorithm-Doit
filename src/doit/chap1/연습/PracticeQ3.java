package doit.chap1.연습;

//네 값의 최소값을 구하는 메서드 작성

public class PracticeQ3 {
    static int Min(int a, int b, int c, int d) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (d < min) {
            min = d;
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(Min(1,2,3, 4));
    }
}
