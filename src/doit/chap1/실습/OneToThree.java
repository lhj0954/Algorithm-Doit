package doit.chap1.실습;

//입력한 정수의 부호판단

import java.util.Scanner;

public class OneToThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        int a = scanner.nextInt();
        if (a < 0) {
            System.out.println(a + "는 음수입니다.");
        } else if (a == 0) {
            System.out.println(a + "는 0입니다.");
        } else {
            System.out.println(a+"는 양수입니다.");
        }
        scanner.close();
    }
}
