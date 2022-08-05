package doit.chap3.연습;

//Arrays.binarySearch로 이진 탐색 검색에 실패하면 삽입 포인트의 값을 출력하도록

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeQ6 {

    static int[] AscOrder(int[] a) {
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

        System.out.print("배열의 크기를 입력해 주세요 :");
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100);
            for (int j=0;j<i;j++) {
                if (a[i]==a[j]) {
                    i--;
                }
            }
        }

        int[] b=AscOrder(a);

        System.out.println(Arrays.toString(b));

        System.out.print("key값을 입력해 주세요 :");
        int key = scanner.nextInt();

        int result = Arrays.binarySearch(b,key);

        if (result < 0) {
            System.out.println("삽입 포인트: "+(-result));
        } else {
            System.out.println("해당 값은 a["+result+"]에 있습니다.");
        }
    }
}
