package doit.chap3.실습;

//선형 검색(while)

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThreeToOne {
    static int linearSearch( int[] a, int key) {
        int i = 0;

        while (true) {
            if (key == a[i]) {
                return i;
            }
            if (a.length-1 == i) {
                return -1;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

         System.out.println("배열의 크기를 입력해 주세요");
         int size = scanner.nextInt();
         int[] a = new int[size];
        for (int i =0;i<a.length; i++) {
            a[i]=random.nextInt(10);
        }

        System.out.println("요소 값: "+ Arrays.toString(a));

        System.out.println("키 값를 입력해 주세요");
        int key = scanner.nextInt();

        int result = linearSearch(a, key);

        System.out.println((result+1)+"번째 요솟값입니다.");
    }


}
