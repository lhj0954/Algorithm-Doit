package doit.chap4.연습;

//clear, indexOf, isEmpty, isFull,

import doit.chap4.실습.FourToOne;

import java.util.Scanner;

public class PracticeQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FourToOne intStack = new FourToOne(64); //크기가 64인 정수형 스택 생성

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", intStack.size(), intStack.getCapacity());
            System.out.println("(1) clear  (2) indexOf   (3) isEmpty  (4) isFull  (0) 종료 : ");

            int menu = scanner.nextInt();
            if (menu == 0) {
                break;
            }

            int x;
            switch (menu) {
                case 1: //clear
                    intStack.clear();
                    break;
                case 2: //indexOf
                    System.out.print("데이터: ");
                    x = scanner.nextInt();
                    x = intStack.indexOf(x);
                    if (x == -1) {
                        System.out.println("해당 데이터는 없습니다.");
                    } else {
                        System.out.println("해당 데이터는 " + (x + 1) + "번째 입니다.");
                    }
                    break;
                case 3: //isEmpty
                    if (intStack.isEmpty()){
                        System.out.println("스택이 bim");
                    } else {
                        System.out.println("스택공간이 남아 있지 않습니다.");
                    }
                    break;
                case 4: //isFull
                    if (intStack.isFull()){
                        System.out.println("스택이 꽉 찼습니다");
                    } else {
                        System.out.println("스택공간이 남아 있습니다.");
                    }
                    break;
            }
        }
    }
}
