package doit.chap3.연습;

//선형검색 스캐닝 과정을 나타내는 프로그램 작성

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());

        int size;

        do {
            System.out.print("배열의 크기를 10 미만으로 입력해 주세요: ");
            size = scanner.nextInt();
        } while (size > 10);

        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(10) + 1; //1~10
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    i--;
                }
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.print("찾고자 하는 값을 입력해 주세요: ");
        int key = scanner.nextInt();

        System.out.print("     |");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        //-----------------------------------------------------------------------
        System.out.print("--+");
        for (int i = 0; i < a.length; i++) {
            System.out.print("--");
        }
        System.out.println();
        //---------------------------------------------------------------------------
        int index;
        for (index = 0; index < a.length; index++) {
            System.out.print("     |");
            for (int i = 0; i <= index; i++) {
                System.out.print("  ");          //개별적으로 반복해줘야 함
                if ((i + 1) % 3 == 0 || (i + 1) % 5 == 0) { // 별 위치를 맞춰주기 위한 똥꼬쑈
                    System.out.print("  ");
                }
            }
            System.out.print("*");
            System.out.println();


            System.out.print("   " + index + "|");
            for (int j : a) {
                System.out.print(" " + j);
            }
            System.out.println();

            if (a[index] == key) {
                break;
            }
        }

        if (index == a.length) {
            System.out.print("해당 key값은 없습니다.");
        } else {
            System.out.print("key값은 " + (index + 1) + "번 째 요솟값입니다.");
        }

    }
}