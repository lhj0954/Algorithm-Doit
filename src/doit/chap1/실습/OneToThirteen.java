package doit.chap1.실습;

//'+'와'-'를 번갈아 가며 n개 출력(2)

import java.util.Scanner;

public class OneToThirteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n을 입력하세요");
        int n = scanner.nextInt();

        for (int i = 0; i < n/2; i++) {
            System.out.print(" + - ");
        }
        if (n % 2 != 0) {
            System.out.print(" + ");
        }
        scanner.close();
    }
}
