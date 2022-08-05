package doit.chap5.연습;

import java.util.Scanner;

public class PracticeQ5 {
    static String[] memo;
    static int count1=0;
    static int count2=0;

    static void recur1(int n) {

        count1++;
        if (memo[n + 1] != null) {
            System.out.print(memo[n + 1]);
        } else {
            if (n > 0) {
                recur1(n - 1);
                System.out.println(n);
                recur1(n - 2);
                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];
            } else {
                memo[n + 1] = " ";
            }
        }
    }

    static void recur2(int n) {
count2++;
        if (n > 0) {
            recur2(n - 1);
            System.out.println(n);
            recur2(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x값 입력 : ");
        int x = scanner.nextInt();

        memo = new String[x+2];

        recur1(x);
        recur2(x);

        System.out.println("recur1이 호출된 횟수: "+count1);
        System.out.println("recur1이 호출된 횟수: "+count2);
    }
}
