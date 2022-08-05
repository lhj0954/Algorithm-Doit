package doit.chap2.실습;

//클래스 선언

public class TwoToTen {

    static class StudentInfo{
        String name;
        int height;
        int weight;

        StudentInfo(String name, int height, int weight) { //생성자
            this.height=height;
            this.name=name;
            this.weight=weight;
        }
    }

    public static void main(String[] args) {
        StudentInfo[] x = {
                new StudentInfo("tnut", 170, 84),
                new StudentInfo("tastynut", 172, 88),
        };

        System.out.println("tnut의 키: "+x[0].height);
        System.out.println("tastynut의 몸무게: "+x[1].weight);
    }
}
