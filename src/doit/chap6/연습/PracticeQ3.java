package doit.chap6.연습;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeQ3 {
    static void swap(int[] a, int x, int y) { //스왑
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    static void bubbleSort(int[] a, int n) { //n: 배열의 크기
        int sw = 0;
        int cp = 0;
        for (int i = 0; i < n - 1; i++) {
            int ex = 0;
            System.out.println("패스 " + (i + 1) + " :");
            for (int j = n - 1; j > i; j--) {
                char c;
                if (a[j - 1] > a[j]) {
                    c='+';
                }else {
                    c='-';
                }
                cp++;
                for (int k = 0; k < n; k++) {

                    System.out.print(k==j ? c : " ");
                    System.out.print("   "+a[k]+"  ");
                }
                System.out.println();
                if (a[j - 1] > a[j]) {
                    sw++;
                    swap(a, j - 1, j);
                    ex++;
                }
            }
            if (ex==0) break;
        }
        System.out.println("비교를 "+cp+"회 했습니다.");
        System.out.println("교환을 "+sw+"회 했습니다.");
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
