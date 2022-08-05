package doit.chap5.실습;

//재귀함수로 팩토리얼 나타내기

import java.util.Scanner;

public class FiveToOne {

    static int Factorial(int n) {
        if (n > 0) {
            return n * Factorial(n - 1);
        } else {
            return 1;
        }
    }

    //return (n>0) ? n*factorial(n-1) : 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요: ");
        int n = scanner.nextInt();

        System.out.printf("n! =%d", Factorial(n));
    }
}