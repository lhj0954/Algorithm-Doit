package doit.chap6.실습;

import java.util.Scanner;

public class SixToSix {
    static void shellSort(int[] a, int n) {
        for (int h = n / 2; h > 0; h /= 2) {
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i]; //비교할 값 선택: 집게로 뽑았다고 생각
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) { //j가 0보다 크고, 해당 요소수가 비교할 값 보다 크면
                    a[j + h] = a[j]; //비교할 값이 있었던 자리에 j번째 요소값 넣기 그리고 j는 h만큼 이동후 j가 음수면 반복 종료
                }
                a[j + h] = tmp; // 집게로 뽑은 값을 비교한 j자리에 넣어준 것임(마지막에 j-=h를 실행하고 음수인 것을 확인하고 반복문을 종료하였기 때문)
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("셸 정렬 1");
        System.out.println("요소수: ");
        int nx = scanner.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        shellSort(x, nx);

        System.out.println("오름차순으로 정렬");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}
