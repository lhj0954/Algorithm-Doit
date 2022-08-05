package doit.chap6.실습;

//단순 삽입 정렬

public class SixToFive {

    static void insertSort(int n, int[] a) {
        for (int i=1;i<n;i++){
            int j = i;
            int tmp = a[i]; //요소 추출해서 보관해놓기
            while (j>0&&a[j-1]>tmp) {
                a[j] = a[j-1]; //해당 요소보다 값이 크면 오른쪽으로 한칸
                j--; //요소값에서 왼쪽으로 한 칸 씩 가면서
            }
            a[j]=tmp; //추출한 요소 적절한 자리에(while문이 멈춘자리)에 대입
        }
    }
}
