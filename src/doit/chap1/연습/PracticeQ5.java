package doit.chap1.연습;

//1C-1의 메소드에 비해 효율이 떨어지는 이유는?

public class PracticeQ5 {
    static int med(int a, int b, int c) {
        if ((b >= a && c <= a) || (b <= a && c >= a)) {
            return a;
        } else if ((a > b && c < b) || (a < b && c > b)) {
            return b;
        }
        return c;
    }
}

// {b >= a와 a > b}, {b <= a와 a < b}같이 같은 판단을 "중복"해서 하게 되므로 효율이 떨어집니다.
