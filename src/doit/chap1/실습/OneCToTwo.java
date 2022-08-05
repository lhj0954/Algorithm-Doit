package doit.chap1.실습;

//2자리 양수를 입력

import java.util.Scanner;

public class OneCToTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int no;
        System.out.println("두자리 양수를 입력하세요.");
        do {
            System.out.print("no: ");
            no = scanner.nextInt();
        } while (no < 10 || no > 99);

        System.out.println("no: " + no);
    }

}
