package doit.chap6.실습;

//한층 더 연산을 줄여준 버블 정렬

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SixToThree {
    static void swap(int[] a, int x, int y) { //스왑
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    static void bubbleSort(int[] a, int n) {
        int k = 0;
        while (k<n-1){
            int last = n-1;
            for (int j = n - 1; j > k; j--) { //패스 : 가장 작은 수를 맨 앞으로 옮김
                if (a[j - 1] > a[j]) {
                    swap(a,j-1, j);
                    last = j; //교환이 일어난다면 그 앞에 요소들은 이미 정렬이 되어 있으므로
                }
            }
            k=last; //그 다음 패스는 해당 지점까지 정렬을 하면 된다.
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
