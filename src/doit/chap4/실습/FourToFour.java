package doit.chap4.실습;

import java.util.Scanner;

public class FourToFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FourToThree intQueue = new FourToThree(64);

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", intQueue.size(), intQueue.getCapacity());
            System.out.println("(1) 인큐  (2) 디큐   (3) 피크  (4) 덤프  (0) 종료 : ");

            int menu = scanner.nextInt();
            if (menu == 0) {
                break;
            }

            int x;
            switch (menu) {
                case 1: //enque
                    System.out.print("데이터: ");
                    x= scanner.nextInt();
                    try {
                        intQueue.enque(x);
                    }catch (FourToOne.OverflowIntStackException e) {
                        System.out.println("스택이 가득 참");
                    }
                    break;
                case 2: //deque
                    try{
                        x=intQueue.deque();
                        System.out.println("팝한 데이터는 "+x+"입니다.");
                    }catch (FourToOne.EmptyIntStackException e) {
                        System.out.println("스택이 bim");
                    }
                    break;
                case 3: //peek
                    try {
                        x=intQueue.peek();
                        System.out.println("peek한 데이터는 "+x+"입니다.");
                    }catch (FourToOne.EmptyIntStackException e){
                        System.out.println("스택이 bim");
                    }
                    break;
                case 4: //dump
                    intQueue.dump();
                    break;
            }
        }
    }
}
