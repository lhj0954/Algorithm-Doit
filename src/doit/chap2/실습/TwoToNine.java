package doit.chap2.실습;

public class TwoToNine {
    public static void main(String[] args) {
        int[] a = new int[500];

        int index = 0;

        a[0] = 2;
        a[1] = 3;

        for (int i = 5; i < 1000; i += 2) {
            int j;
            for (j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i % j != 0) {
                a[index + 2] = i;
            }
            index++;
        }

        for (int i = 0; i < index; i++) {
            if (a[i] != 0) {
                System.out.println(a[i]);
            }

        }

    }
}
