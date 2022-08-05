package doit.chap2.실습;

//배열 요소의 최댓값 출력(난수 활용)

import java.util.Random;
import java.util.Scanner;

public class TwoToFour {
    static int Max(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    max = a[j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // Random클래스

        System.out.println("배열 크기를 입력하세요.");
        int size = scanner.nextInt();

        System.out.println("배열 요소를 입력하세요.");
        int[] array = new int[size];
        for (int k = 0; k < array.length; k++) {
            array[k] = random.nextInt(100);
            System.out.println((k+1)+" 번째 요소 값: "+array[k]);
        }
        int max = Max(array);

        System.out.println("최대값은 "+max+" 입니다.");
    }
}
