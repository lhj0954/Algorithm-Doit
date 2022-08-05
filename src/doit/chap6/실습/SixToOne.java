package doit.chap6.실습;

//버블 정렬

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class SixToOne {
    static void swap(int[] a, int x, int y) { //스왑
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

//    static void swap(int x, int y) { //스왑  int x = a[j], int y = a[j-1]로 받아옴
//        int t = x;
//        x = y;
//        y = x;
//    }   처럼 한다면 왜 안될까? => x,y는 메소드의 지역 변수 이기때문에 외부 데이터인 a에 영향을 주지 못한다..!!!

    static void bubbleSort(int[] a, int n) { //n: 배열의 크기
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a,j-1, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());

        System.out.print("배열의 크기를 입력해 주세요 :");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) { //중복 제거
            a[i] = rand.nextInt(100);
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    i--;
                }
            }
        }
        System.out.println(Arrays.toString(a));

        bubbleSort(a, n);

        System.out.println(Arrays.toString(a));
    }
}
