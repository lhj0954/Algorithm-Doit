package doit.chap5.연습;

//유클리드 재귀호출 없이 작성

import java.util.Scanner;

public class PracticeQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("최대 공약수를 구할 두 수를 입력하세요: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int large;
        int small;

        do {
            if (a > b) {
                large = a;
                small = b;
            } else {
                large = b;
                small = a;
            }

            if (large%small==0){
                 break;
            }
            a = large%small;
            b = small;
        }while (true);

        System.out.println("최대공약수: " + small);
    }
}
