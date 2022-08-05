package doit.chap5.연습;

//factorial메서드를 재귀메서드 호출말고 구현하시오.

public class PracticeQ1 {
    static int Factorial(int n) {
        int k=1;
        for (int i = 2; i <= n; i++) {
            k=k*i;
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }
}
