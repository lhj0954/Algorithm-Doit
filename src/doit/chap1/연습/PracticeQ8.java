package doit.chap1.연습;

import java.util.Scanner;

//정수 a부터 정수 b까지 합을 구하시오.

public class PracticeQ8 {
    static int rangeSum (int a, int b) {
        int sum = 0;
        for (int start = a; start<=b; start++) {
            sum += start;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = rangeSum(a,b);

        System.out.println(sum);
        scanner.close();
    }
}
