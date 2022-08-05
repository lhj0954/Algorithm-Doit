package doit.chap1.실습;

//별 갯수 뽑고 줄바꿈 (2)

import java.util.Scanner;

public class OneToFifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇 개의 별을 입력하실까요?");
        int n = scanner.nextInt();
        System.out.println("몇 개마다 줄을 바꿀까요?");
        int w = scanner.nextInt();

        for (int i = 0; i < n / w; i++) {
            System.out.println("*".repeat(w));
        }

        int rest = n % w;
        if (rest != 0) {
            System.out.println("*".repeat(rest));
        }
        scanner.close();
    }
}
