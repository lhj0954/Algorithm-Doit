package doit.chap3.실습;

//선형 검색(보초법): 배열 마지막에 보초값을 넣음으로서 판단문을 절반(2회->1회)으로 줄임 ;마지막 요솟값에 보촛값을 배정이 되어버림...

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThreeToThree_re {
    static int linearSearch(int[] a, int key) {
        a[a.length-1] = key; //보초값

        int i;

        for (i = 0; i < a.length; i++) {
            if (a[i] == key) {
                break;
            }
        }

        return i==a.length-1 ? -1 : i;
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



        int result = linearSearch(a,key);

        System.out.println(result);
    }
}
