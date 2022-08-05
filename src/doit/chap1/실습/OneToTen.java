package doit.chap1.실습;

import java.util.Scanner;

//for 문으로 등차가 1인 등차수열 합 +  과정보여주기

public class OneToTen {
    static int for_sum (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum += i;

            if (i < n) {
                System.out.print(i + " + ");
            } else {
                System.out.println(i + " = " + sum);
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n을 입력해 주세요 n: ");
        int n = scanner.nextInt();
        int sum = for_sum(n);
        System.out.println("총합은 "+sum+"입니다.");
        scanner.close();
    }
}