package doit.chap1.연습;

//*로 정사각형 출력하기

import java.util.Scanner;

public class PracticeQ13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정사각형 변의 길이 입력: ");
        int l = scanner.nextInt();

        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= l; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
