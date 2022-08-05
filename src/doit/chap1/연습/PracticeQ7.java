package doit.chap1.연습;

import java.util.Scanner;

//가우스 덧셈 프로그램

public class PracticeQ7 {
    static int Gaus(int n) {
        int sum = 0;
        return sum = n*(1+n)/2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("give me 'n' ");
        int n = scanner.nextInt();
        int sum = Gaus(n);
        System.out.println("sum is "+sum);
        scanner.close();
    }
}
