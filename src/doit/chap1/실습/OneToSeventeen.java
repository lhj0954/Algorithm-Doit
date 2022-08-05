package doit.chap1.실습;

//왼쪽 아래가 직각인 이등변삼각형을 출력

import java.util.Scanner;

public class OneToSeventeen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("밑변의 길이 : ");
        int l = scanner.nextInt();
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
