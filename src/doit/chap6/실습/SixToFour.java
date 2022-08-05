package doit.chap6.실습;

//단순 선택 정렬

public class SixToFour {
    static void SelectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) { //스왑을 안에 넣은 형태
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }
}
