package doit.chap3.실습;

//오름차순과 이진 검색 (오름차순은 여기 만들어 놓고 가져다 쓸 생각으로 만듦)

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThreeToFour {

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

    static int BinarySearch(int[] a, int n) { //이진검색 n:찾고자 하는 값
        int start = 0; // 이진검색 구역 시작점 초기값
        int end = a.length - 1; //이진검색 구역 끝점 초기값

        do {
            int mid = (start + end) / 2;  //이진 검색 기준점: n과 비교할 값
            if (a[mid] == n) { //찾고자 하는 값과 일치 시
                return mid;
            }
            if (n < a[mid]) { //찾고자 하는 값이 기준값보다 작으면
                end = mid-1;
            } else {
                start = mid+1;
            }
        } while (start <= end);

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());

        System.out.println("배열의 크기를 입력해 주세요: ");
        int size = scanner.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < a.length; i++) { //중복이 없는 난수 배열 생성
            a[i] = rand.nextInt(100);
            for (int j=0;j<i;j++) {
                if (a[i]==a[j]) {
                    i--;
                }
            }
        }

        for (int k = 0; k<a.length; k++) {
            System.out.println((k + 1) + "번째 요솟값: " + a[k]);
        }

        int[] b = AscOrder(a);
        System.out.println("오름차순 정렬 확인" + Arrays.toString(b));

        System.out.println("찾고자하는 값를 입력해 주세요: ");
        int n = scanner.nextInt();

        int result = BinarySearch(b, n);

        if (result == -1) {
            System.out.println("해당 값을 찾지 못하였습니다.");
        } else  {
            System.out.println("찾고자 하는 값은 " + (result + 1) + "번째 요솟값입니다.");
        }
    }
}
