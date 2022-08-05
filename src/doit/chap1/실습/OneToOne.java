package doit.chap1.실습;

//3개의 정숫값을 입력하고 최댓값을 구하여 출력

import java.util.Scanner;

public class OneToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("3개의 정수를 입력하고 가장 큰 값을 구합니다.");
        System.out.println("a 값: ");
        int a = scanner.nextInt();
        System.out.println("b 값: ");
        int b = scanner.nextInt();
        System.out.println("c 값: ");
        int c = scanner.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("최대값: " + max);
        scanner.close();
    }
}
