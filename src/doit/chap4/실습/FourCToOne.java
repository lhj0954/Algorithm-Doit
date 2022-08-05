package doit.chap4.실습;

//링 버퍼는 오래된 데이터를 버리기 위해 사용한다.

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class FourCToOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = 10; //큐의 크기
        int[] a = new int[n];
        int cnt = 0; //입력받은 개수
        int retry;

        System.out.println("정수 입력: ");

        do {
            System.out.printf("%d번째 정수: ", cnt + 1);
            a[cnt++ % n] = scanner.nextInt(); //첫 번째++ 인덱스 값이 10++번째 인덱스 값으로 덮어짐->반복

            System.out.print("계속 할까요? (예.1/아니요.0): ");
            retry = scanner.nextInt();
        } while (retry == 1);

        int i = cnt-n;
        if (i < 0) { //10미만 으로 값을 받으면 i=0
            i=0;
        }
        for (;i<cnt;i++){ //10개씩 값을 출력하도록 함
            System.out.printf("%2d번째 정수 = %d\n", i+1, a[i%n]);
        }
    }
}
