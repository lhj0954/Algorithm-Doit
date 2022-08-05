package doit.chap3.연습;

//이진 검색 과정을 나타내는 프로그램 작성

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeQ4 {
    static int[] AscOrder(int[] a) { //오름차순
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        return a;
    }

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

        a = AscOrder(a);

        System.out.println(Arrays.toString(a));
        System.out.print("찾고자 하는 값을 입력해 주세요: ");
        int key = scanner.nextInt();

        System.out.print("     |");
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        System.out.print("--+");
        for (int i = 0; i < a.length; i++) {
            System.out.print("--");
        }
        System.out.println();

        //----------------------------------------------------------반복구간---------------------------------
        int start = 0;
        int end = a.length - 1;
        int mid = (start + end) / 2;

        do {
            System.out.print("     |"); //경계면 출력

            for (int i=0;i<start;i++) { //'<-'모양 출력
                System.out.print("  ");
            }
            System.out.print("<-");

            for (int i=0;i<mid;i++) { //'*'모양 출력
                System.out.print("  ");
            }
            System.out.print("*");

            for (int i=0;i<end;i++) { //'->'모양 출력
                System.out.print("  ");
            }
            System.out.print("->");

            System.out.println(); // 다음 줄

            System.out.print("   "+mid+"|"); //경계면 출력

            for (int j : a) {
                System.out.print(" " + j);
            }
            System.out.println();

            //출력 반복 구간 종료 이진 탐색 로직 실행
            if (a[mid] == key) {
                break;
            }
            if (key < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        } while (start <= end);

    }
}
