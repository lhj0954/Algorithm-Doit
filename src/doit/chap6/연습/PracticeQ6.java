package doit.chap6.연습;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeQ6 {
    static void swap(int[] a, int x, int y) { //스왑
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    static void selectSort(int n, int[] a) {
        for (int i = 0; i < n - 1; i++) {
            int min = i; //제일 작은 인덱스 임의의 최소값 설정
            for (int l = 0; l < i; l++) {
                System.out.print("   ");
            }
            System.out.print("  " + "*"); //별 표시
            int j;
            for (j = i + 1; j < n; j++) { //최솟값을 가진 인덱스를 찾아서
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            for (int m = 0; m <= j; m++) {
                System.out.print("   ");
            }
            System.out.print("  " + "+");
            System.out.println();
            for (int k = 0; k < n; k++) {
                System.out.print("  " + a[k]); //스왑전 배열 출력
            }
            System.out.println();
            swap(a, i, min); //기존 최솟값과 교환
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

        selectSort(n, a);
    }
}
