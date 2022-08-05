package doit.chap1.실습;

import java.util.Scanner;

//while문으로 1부터 n까지 합을 구하시오

public class OneToSeven {
    static int sum(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n을 입력해 주세요. n: ");
        int n = scanner.nextInt();
        int sum = sum(n);
        System.out.println("총 합: "+ sum);
        scanner.close();
    }
}
