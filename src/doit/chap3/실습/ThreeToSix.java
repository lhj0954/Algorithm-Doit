package doit.chap3.실습;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeToSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] x = {
                "apple", "banana", "mango"
        };

        System.out.println("과일 이름을 검색해 보세용");
        String ky = scanner.next(); //next(): 스캔 메서드의 스트링형

        int result = Arrays.binarySearch(x, ky);

        if (result < 0) {
            System.out.println("과일을 찾을 수 없습니다ㅜㅜ");
        } else {
            System.out.println("해당 값은 a["+result+"]에 있습니다.");
        }
    }
}
