package doit.chap2.실습;

//배열을 복제

import java.util.Arrays;

public class TwoCToOne {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b= a.clone();

        System.out.println(Arrays.toString(b));
    }
}
