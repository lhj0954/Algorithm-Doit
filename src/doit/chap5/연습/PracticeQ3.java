package doit.chap5.연습;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
//배열 a의 모든 요소의 최대공약수를 구하는 메서드를 작성하시오

public class PracticeQ3 {
    static int Euclid(int a, int b) {
        if (b==0){
            return a;
        }else {
            return Euclid(b, a%b);
        }
    }

    static int gcdArray(int[] a) {
        int preGcd =a[0];
        for (int i = 1; i < a.length; i ++) {
            preGcd=Euclid(preGcd,a[i]);
        }
        return preGcd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());

        System.out.print("배열의 크기를 입력하세요 :");
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i =0;i<a.length;i++){
            a[i]=rand.nextInt(100)+1;
        }
        System.out.println(Arrays.toString(a));

        System.out.println("배열 요솟값들의 최대공약수 : "+gcdArray(a));
    }
}
