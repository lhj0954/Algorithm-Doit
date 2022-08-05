package doit.chap5.실습;

//메모이제이션 활용

public class FiveToSix {
    static String[] memo;

    static void recur(int n) {
        if (memo[n + 1] != null) {
            System.out.print(memo[n + 1]);
        } else {
            if (n > 0) {
                recur(n - 1);
                System.out.println(n);
                recur(n - 2);
                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];
            } else {
                memo[n + 1] = " ";
            }
        }
    }
}
