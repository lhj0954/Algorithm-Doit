package doit.chap3.연습;

//배열의 요솟값이 중복되고 중복되는 요솟값을 찾을 때, 해당 요솟값들의 인덱스를 저장하는 배열을 만들고 이 배열의 크기를 리턴하시오.
//동적배열의 미리 공부하라는 뜻인지 잘 모르겠음

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeQ3 {
    static int searchIdx(int[] a, int key, int n, int[] idx) { //배열, 키 값, 기존 배열의 크기 ,인덱스를 담은 배열: 배열을 외부에서 참조하는데 배열의 크기를 구하라..?
        int match = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {   //키 값과 요솟값이 일치하면
                idx[match++] = i;        //매치횟수(idx의 인덱스값)이 1부터 1씩 증가하고
            }
        }
        return match;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());

        System.out.print("배열의 크기를 입력하시오 : ");
        int size = scanner.nextInt();
        int[] a = new int[size];

        for (int i=0; i<a.length; i++) {
            a[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(a));

        System.out.print("key값을 입력하시오 : ");
        int key = scanner.nextInt();

        int[] idx = new int[size]; //...해답지에서도 그냥 배열 크기 정해져 있고 그와 별개로 중복된 요소값들의 개수를 구함....아오

        int result = searchIdx(a,key,a.length,idx);

        System.out.println("매치되는 key값의 개수: "+result);
    }
}
