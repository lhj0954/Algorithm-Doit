package doit.chap6.연습;

//버블정렬 배열 앞에서 부터

public class PracticeQ1 {
    static void swap(int[] a, int x, int y) { //스왑
        int t = a[x];
        a[x] = a[y];
        a[y] = t;
    }

    static void bubbleSort(int[] a, int n) {//반대 방향 패스
        int l = n-1;
        while (l>0){
            int last = 0;
            for(int i = 0; i< l; i++){ //마지막 스왑이 일어난 시점을 목표로 정렬 진행
                if (a[i]> a[i+1]){
                    swap(a,i,i+1);
                    last = i; //마지막 스왑이 일어난 시점
                }
            }
            l=last; //l에 마지막 스왑이 일어난 시점을 저장하여 for문에 i의 범위를 제한해줌
        }
    }
}
