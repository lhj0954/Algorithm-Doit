package doit.chap3.연습;

//실습 3-8을 내림차순으로

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PracticeQ7 {

    static class Height {
        private int height;

        public Height(int height) {
            this.height=height;
        }

        public String toString() {
            return height+" ";
        }

        public static final Comparator<Height> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<Height> {
            public int compare(Height d1, Height d2) {
                return (d1.height < d2.height) ? 1 : (d1.height)>(d2.height) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Height[] x = {
                new Height(165),
                new Height(164),
                new Height(163),
                new Height(162),
                new Height(161),
                new Height(160),
        };
        System.out.print("입력 할 키: ");
        int height = scanner.nextInt();

        int idx = Arrays.binarySearch(x,new Height(height), Height.HEIGHT_ORDER); //HEITH_ORDER에 의해 검색

        if (idx < 0) {
            System.out.println("없음");
        } else {
            System.out.println("그 값은 x["+idx+"]에 있습니다.");
            System.out.println("찾은 데이터: "+x[idx]);
        }
    }
}
