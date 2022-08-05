package doit.chap5.실습;

//하노이의 탑 문제: 로직이 아직 잘 이해가 되질 않음

import java.util.Scanner;

public class FiveToSeven_re {
    static void Hanoi (int no, int x, int y) { //원반의 개수, x에서 y로 원반을 옮김
        if (no > 1) {
            Hanoi(no-1,x,6-x-y); //그룹을 1번 기둥에서 2번 기둥으로 옮김 그룹이 1개가 될 때까지
        }
        System.out.printf("원반 [%d]을(를) %d번 기둥에서 %d번 기둥으로 옮김\n",no,x,y);
        if (no > 1) {
            Hanoi(no-1,6-x-y,y); //그룹을 2번 기둥에서 3번 기둥으로 옮김 그룹이 1개가 될 때까지
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원반 갯수: ");
        int n = scanner.nextInt();

        Hanoi(n,1,3); //하노의 탑 목표로 n개의 원반을 1번 기둥에서 3번 기둥으로 옮기고자 한다!
    }
}
