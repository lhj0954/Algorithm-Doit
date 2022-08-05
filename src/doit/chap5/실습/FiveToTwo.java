package doit.chap5.실습;

//유클리드 호제법

import java.util.Scanner;

public class FiveToTwo {
    //    static int Euclid(int a, int b) {
//        int large;
//        int small;
//        if (a > b) {
//            large = a;
//            small = b;
//        } else {
//            large = b;
//            small = a;
//        }
//
//        if (large%small==0){
//            return small;
//        }
//        small = large%small;
//        large = small;
//        return Euclid(large,small);
//    }
    static int Euclid(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return Euclid(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("최대 공약수를 구할 두 수를 입력하세요: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("최대공약수: " + Euclid(a, b));
    }
}
