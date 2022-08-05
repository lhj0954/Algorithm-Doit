package doit.chap5.실습;

//재귀의 비재귀적 표현 : 꼬리 없애기

public class FiveToFour {
    static void recur(int n) {
        while (n>0){
            recur(n-1);
            System.out.println(n);
            n=n-2; //꼬리 제거
        }
    }
}
