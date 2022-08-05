package doit.chap3.연습;

//이진 검색에서 찾고자 하는 값이 중복된 경우 해당 요솟값의 인덱스가 가장 작은 값을 찾아라

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PracticeQ5 {
    static int binSearchX(int[] a, int key){ //1. 이진 검색 2. 해당 값으로 선형 검색 후 최초 인덱스 출력

        int start = 0;
        int end = a.length - 1;

        do {                                                    //이진 검색
            int mid = (start + end) / 2;
            if (a[mid] == key) {
                break;
            }
            if (key < a[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        } while (start <= end);

        if (start > end){ // 값을 못 찾았다면 -1리턴
            return -1;
        } else {                //값을 찾았다면 선형 검색
            int i = 0;

            while (key != a[i]) {
                i++;
            }
            return i; //해당 최초 인덱스 리턴
        }
    }

    static int[] AscOrder(int[] a) { //오름차순
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        System.out.print("배열의 크기를 입력해 주세요 :");
        int size = scanner.nextInt();
        int[] a = new int[size];
        for (int i =0;i<a.length; i++) {
            a[i]=random.nextInt(10); //->바운더리가 너무 크면 중복된 수가 안 나올 것 같음...
        }

        int[] b=AscOrder(a);

        System.out.println(Arrays.toString(b));

        System.out.print("key값을 입력해 주세요 :");
        int key = scanner.nextInt();

        int result = binSearchX(b,key);

        if (result == -1){
            System.out.println("해당 값을 찾지 못하였습니다.");
        } else {
            System.out.println("key값을 가진 최초의 요소의 인덱스는 "+result+" 입니다.");
        }
    }
}
