package doit.chap2.연습;

import java.util.Arrays;
import java.util.Random;

//배열 복사하기(a를 b로 복사)

public class PracticeQ4 {
    static String copy (int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        return Arrays.toString(b);
    }

    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();

        int size = rand1.nextInt(10);
        System.out.println("배열의 크기: "+size);

        int[] a = new int[size];
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand2.nextInt(100);
            System.out.println("a의 "+(i+1)+" 번째 요소 값: "+a[i]);
        }

        String arrayB = copy(a, b);
        System.out.println("b의 배열: "+arrayB);
    }
}
