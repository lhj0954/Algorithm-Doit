package doit.chap1.연습;

//피라미드 만들기

import java.util.Scanner;

public class PracticeQ15 {
    static void spira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = i; k <= n; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("밑변의 길이 : ");
        int l = scanner.nextInt();
        spira(l);
    }
}
