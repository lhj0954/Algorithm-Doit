package doit.chap1.실습;

//3개의 정숫값을 입력하고 중앙값을 출력

import java.util.Scanner;

public class OneCToOne {
    /*static int Determine(int a, int small, int large, int center) {
        if (a < small) {
            center = small;
        }
        if (a > small) {
            if (a <= large) {
                center = a;
            }
            if (a >= large) {
                center = large;
            }
        }

        return center;
    }
    static int Center(int a, int b, int c) {
        int large, small;
        int center = a;
        if (b < c) {
            small = b;
            large = c;
            Determine(a, small, large, center);
        }
        if (b > c) {
            small = c;
            large = b;
            Determine(a, small, large, center);
        }
        if (b == c) {
            center = b;
        }
        return center;
    }*/

    static int Center(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }
        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        int a = scanner.nextInt();
        System.out.println("b: ");
        int b = scanner.nextInt();
        System.out.println("c: ");
        int c = scanner.nextInt();

        System.out.println(Center(a,b,c));
        scanner.close();
    }
}
