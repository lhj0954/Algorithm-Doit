package doit.chap1.연습;

//직각삼각형 요리조리

import java.util.Scanner;

public class PracticeQ14 {
    static void triangleLB(int n) { //왼쪽 아래가 직각인 직각삼각형
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) { //왼쪽 위가 직각인 이등변삼각형
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) { //오른 쪽 위가 직각인 이등변삼각형
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRB(int n) { //오른 쪽 아래가 직각인 이등변삼각형
        for (int i = 1; i <= n; i++) {
            for (int k = i; k <= n; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("밑변의 길이 : ");
        int l = scanner.nextInt();
        triangleRB(l);
    }
}
