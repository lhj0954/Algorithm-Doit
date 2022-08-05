package doit.chap1.실습;

//*을 n개 출력하되 w개마다 줄바꿈

import java.util.Scanner;

public class OneToFourteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇 개의 별을 입력하실까요?");
        int n = scanner.nextInt();
        System.out.println("몇 개마다 줄을 바꿀까요?");
        int w = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            if (i % w == 0) {
                System.out.print("\n");
            }
        }
    }

}
