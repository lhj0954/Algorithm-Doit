package doit.chap2.실습;

//구성 요서의 자료형이 int형인 배열

public class TwoToOne {
    public static void main(String[] args) {
        int[] a = new int[5]; // 선언하기 = 참조하기(주소할당해준다 생각하면 될 듯 즉, 실체 라는 뜻)

        a[1] = 12;
        a[2] = 13;
        a[3] = a[1]*a[2];

        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
