package doit.chap1.실습;

//'+'와'-'를 번갈아 가며 n개 출력

import java.util.Scanner;

public class OneToTwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n을 입력하세요");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(" + ");
            } else {
                System.out.print(" - ");
            }
        }
    }
}
