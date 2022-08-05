package doit.chap2.연습;

//시력분포를 별로 표현하기...귀찮아서 안 만든 관계로 몸무게를 표로 받아서 나타내보겠습니다...

public class PracticeQ7 {
    static class Chart {
        String name;
        int height;

        Chart(String name, int height) {
            this.height = height;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Chart[] x = {
                new Chart("tnut", 10),
                new Chart("tastynut", 12),
                new Chart("이학준", 15),
                new Chart("주호은", 21),
                new Chart("최민규", 28),
                new Chart("공주맛밤", 32)
        };

        int h1=0;
        int h2=0;
        int h3=0;

        for (Chart chart : x) {
            if (chart.height < 20) {
                h1++;
            } else if (chart.height < 30) {
                h2++;
            } else {
                h3++;
            }
        }

        System.out.print("0~20: ");
        for (int i = 0; i < h1; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("20~30: ");
        for (int i = 0; i < h2; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("30~: ");
        for (int i = 0; i < h3; i++) {
            System.out.print("*");
        }

    }
}
