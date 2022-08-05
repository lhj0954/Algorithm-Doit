package doit.chap5.실습;

//재귀의 비재귀화 : 재귀 없애기

import doit.chap4.실습.FourToOne; //Intstack입니다...ㅎㅎ

public class FiveToFive {
    static void recur(int n) {
        FourToOne s = new FourToOne(n);

        while (true){
            if (n>0){
                s.push(n);
                n=n-1;
                continue;
            }
            if (!s.isEmpty()){
                n=s.pop();
                System.out.println(n);
                n=n-2;
                continue;
            }
            break;
        }
    }
}
