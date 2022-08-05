package doit.chap1.실습;

import java.util.Scanner;

//양수만 입력하여 합 구하기

public class OneToNine {
    static int for_sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        do {
            System.out.println("n을 입력해 주세요 n: ");
            n = scanner.nextInt();
            if (n < 1) {
                System.out.println("양수를 입력해 주세요");
            }
        } while (n <= 0);

        int sum = for_sum(n);
        System.out.println("총합은 " + sum + "입니다.");

        scanner.close();
    }
}
