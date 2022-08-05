package doit.chap6.실습;

//불필요한 연산을 줄여준 버블 정렬

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SixToTwo {
    static void swap(int[] a, int x, int y) { //스왑
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int ex = 0;
            for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a,j-1, j);
                    ex++;
                }
            }
            if(ex==0) break; //교환이 이루어지지 않는 패스가 있은 후 부터 연산하지 않는다.
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
