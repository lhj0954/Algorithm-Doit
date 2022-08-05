package doit.chap3.실습;

//Arrays.binarySearch로 이진 탐색

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThreeToFive {

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

        System.out.print("배열의 크기를 입력해 주세요 :");
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) { //중복이 없는 난수 배열 생성
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
            System.out.println("해당 값을 찾을 수 없습니다.");
        } else {
            System.out.println("해당 값은 a["+result+"]에 있습니다.");
        }
    }
}
