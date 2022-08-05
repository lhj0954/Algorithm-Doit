package doit.chap6.실습;

public class SixToEighteen {
    static void countingSort(int[] a, int n, int max) {
        int[] f = new int[max+1];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) { //도수분포표 만들기
            f[a[i]]++;
        }

        for (int i = 1; i <= max; i++) { //누적 도수분포표 만들기
            f[i] += f[i-1];
        }

        for (int i = n-1; i >= 0; i--) { //목표배열 만들기
            b[--f[a[i]]] = a[i];
        }

        for (int i = 0; i < n; i++) { //배열 복사하기
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {

    }
}
