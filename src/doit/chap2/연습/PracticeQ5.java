package doit.chap2.연습;

//배열의 역순 복사하기

import java.util.Arrays;
import java.util.Random;

public class PracticeQ5 {
    static int[] swap(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            int t;
            t = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = t;
        }
        return a;
    }

    static String copy (int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        return Arrays.toString(b);
    }

    public static void main(String[] args) {
        Random rand1 = new Random(1); //0이 나와서 곤란하다면 시드값을 바꿔주면 된다. 따라서 책의 내용에 따르면 현재 시간을 시드로 하는 것이 적합하다.
        Random rand2 = new Random();

        int size = rand1.nextInt(10);
        System.out.println("배열의 크기: "+size);

        int[] a = new int[size];
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand2.nextInt(100);
            System.out.println("a의 "+(i+1)+" 번째 요소 값: "+a[i]);
        }

        int[] invertArray = swap(a);

        String arrayB = copy(invertArray, b);
        System.out.println("a의 역순을 복사한 b의 배열: "+arrayB);
    }
}
