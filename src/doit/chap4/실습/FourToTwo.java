package doit.chap4.실습;

//FourToOne에서 받아서 실습하장

import java.util.Scanner;

public class FourToTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FourToOne intStack = new FourToOne(64); //크기가 64인 정수형 스택 생성

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", intStack.size(), intStack.getCapacity());
            System.out.println("(1) 푸시  (2) 팝   (3) 피크  (4) 덤프  (0) 종료 : ");

            int menu = scanner.nextInt();
            if (menu == 0) {
                break;
            }

            int x;
            switch (menu) {
                case 1: //push
                    System.out.print("데이터: ");
                    x= scanner.nextInt();
                    try {
                        intStack.push(x);
                    }catch (FourToOne.OverflowIntStackException e) {
                        System.out.println("스택이 가득 참");
                    }
                    break;
                case 2: //pop
                    try{
                        x=intStack.pop();
                        System.out.println("팝한 데이터는 "+x+"입니다.");
                    }catch (FourToOne.EmptyIntStackException e) {
                        System.out.println("스택이 bim");
                    }
                    break;
                case 3: //peek
                    try {
                        x=intStack.peek();
                        System.out.println("peek한 데이터는 "+x+"입니다.");
                    }catch (FourToOne.EmptyIntStackException e){
                        System.out.println("스택이 bim");
                    }
                    break;
                case 4: //dump
                    intStack.dump();
                    break;
            }
        }
    }
}
