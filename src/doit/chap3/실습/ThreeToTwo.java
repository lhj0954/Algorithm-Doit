package doit.chap3.실습;

//선형 검색(for)

public class ThreeToTwo {
    static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }


    //3-1과 이하동문
}
