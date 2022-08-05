package doit.chap1.실습;

//이중루프 구구단

public class OneToSixteen {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d",i*j);
            }
            System.out.println();
        }
    }
}
