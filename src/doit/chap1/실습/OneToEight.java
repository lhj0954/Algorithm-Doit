package doit.chap1.실습;

import java.util.Scanner;

//for 문으로 등차가 1인 등차수열 합

public class OneToEight {
    static int for_sum (int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) { //개인적인 복습: for문의 i는 iterate(반복하다)라는 뜻에서 유래했다. 디지인 패턴중 iterator패턴이 있다.
            sum += i;
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
