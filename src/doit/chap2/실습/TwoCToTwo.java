package doit.chap2.실습;

//확장된 for문

public class TwoCToTwo {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i : a) {  //정수 i로 배열 a의 인덱스를 끝까지 조사
            //sum += a[i]; // 오류: for(int i=0; i<=a.length; i++)
            sum+= i;
        }

        System.out.println(sum);
    }
}
