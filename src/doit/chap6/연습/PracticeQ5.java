package doit.chap6.연습;

//양방향 버블 정렬( 칵테일 정렬, 쉐이커 정렬) 이름도 많다...

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeQ5 {
    static void swap(int[] a, int x, int y) { //스왑
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    static void bidrectionBubbleSort(int[] a, int n) {  //홀수패스엔 뒤에서 짝수패스엔 앞에서
        int k = 0;
        int l = n - 1;
        int cnt = 1;
        while (k < n - 1 || l > 0) {
            int last1 = 0;
            int last2 = n - 1;

            if (cnt % 2 == 1) {
                for (int j = n - 1; j > k; j--) { //패스:홀수번째
                    if (a[j - 1] > a[j]) {
                        swap(a, j - 1, j);
                        last1 = j;
                    }
                }
            } else {
                for (int i = 0; i < l; i++) { //패스:짝수번째
                    if (a[i] > a[i + 1]) {
                        swap(a, i, i + 1);
                        last2 = i;
                    }
                }
            }
            k = last1;
            l = last2;
            cnt++;
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

        bidrectionBubbleSort(a, n);

        System.out.println(Arrays.toString(a));
    }
}
