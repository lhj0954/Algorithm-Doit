package doit.chap2.실습;

//소수 나열 (2): 계산 과정 줄이기(소수는 홀수 인 점, 이전 소수들로 나누어지지 않으면 소수라는 점)

public class TwoToEight {
    public static void main(String[] args) {

        int counter = 0;
        int ptr = 0;
        int[] prime = new int[500];

        prime[ptr++] = 2;

        for (int n = 3; n <= 1000; n += 2) {
            int i;
            for (i = 1; i < ptr; i++) {
                counter++;
                if (n % prime[i] == 0) {
                    break;
                }
            }
            if (ptr == i) {
                prime[ptr++] = n;
            }
        }
        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }
    }
}
