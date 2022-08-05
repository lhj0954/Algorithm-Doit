package doit.chap1.연습;

//4개의 값의 최대값을 구하는 메서드 작성

public class PracticeQ1 {
    static int Max(int a, int b, int c, int d) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(Max(1,2,3,4));
    }
}
