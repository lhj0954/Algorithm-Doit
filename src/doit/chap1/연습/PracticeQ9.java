package doit.chap1.연습;

import java.util.Scanner;

//정수 b-a 구하기 (b>a)

public class PracticeQ9 {
    static int Gap(int a, int b) {
        int gap = b - a;
        return gap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        do {
            System.out.println("a값 입력");
            a = scanner.nextInt();
            System.out.println("b값 입력");
            b = scanner.nextInt();
            if (a > b) {
                System.out.println("b는 a보다 크거나 같아야 합니다.");
            }
        } while (b < a);

        int gap = Gap(a,b);

        System.out.println("b-a = " + gap);
    }
}
