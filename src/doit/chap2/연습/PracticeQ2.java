package doit.chap2.연습;

//배열 역순 추가적으로 다듬기

import java.util.Arrays;
import java.util.Random;

public class PracticeQ2 {
    static int[] swap(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            System.out.println(Arrays.toString(a));
            System.out.println("a["+i+"]와 "+"a["+(a.length-1-i)+"]를 교환합니다.");
            int t;
            t = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = t;
        }
        System.out.println(Arrays.toString(a));
        System.out.println("정렬을 마쳤습니다.");
        return a;
    }

    public static void main(String[] args) {
        Random rand1 = new Random();
        Random rand2 = new Random();

        int size = rand1.nextInt(10);
        int[] array = new int[size];
        System.out.println("배열의 크기: " + size);

        for (int k = 0; k < array.length; k++) {
            array[k] = rand2.nextInt(100);
            System.out.println((k+1)+" 번째 요소 값: "+array[k]);
        }

        int[] invertArray = swap(array);
        System.out.println("역순으로 재배열: "+ Arrays.toString(invertArray)); //배열을 문자열로 나타내준다.
    }
}
