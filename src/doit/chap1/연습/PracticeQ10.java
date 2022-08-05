package doit.chap1.연습;

//양의 정수를 입력하고 그 수의 자릿수를 출력하시오

import java.util.Scanner;

public class PracticeQ10 {
    static int digit(int n) {
        return (int) Math.log10(n)+1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("n입력");
            n = scanner.nextInt();
            if (n<0) {
                System.out.println("양의 정수!");
            }
        } while (n<0);

        System.out.println("그 수는 " + digit(n) + " 자리입니다.");
    }
}
