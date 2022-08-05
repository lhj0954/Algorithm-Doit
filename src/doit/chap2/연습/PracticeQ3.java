package doit.chap2.연습;

//배열 모든 요소 합계

import java.util.Random;

public class PracticeQ3 {
    static int sumElements(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();

        int size = rand1.nextInt(10);
        System.out.println("배열의 크기: " + size);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand2.nextInt(100);
            System.out.println((i+1)+" 번째 요소 값: "+array[i]);
        }

        int sum = sumElements(array);

        System.out.println("요소들의 합: "+ sum);
    }
}
