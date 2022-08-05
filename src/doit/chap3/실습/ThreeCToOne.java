package doit.chap3.실습;

class Id {
    private static int counter = 0; //클래스 변수: 아이디를 몇 개 부여했는지 저장
    private int id; //인스턴스 변수

    public Id() { //생성자
        id = ++counter;
    }

    public static int getCounter() { //클래스 메서드
        return counter;
    }

    public int getId(){ //인스턴스 메서드
        return id;
    }
}

public class ThreeCToOne {
    public static void main(String[] args) {
        Id a = new Id();
        Id b = new Id(); //인텔리 제이 한 줄 복사 단축키 : ctrl+d

        System.out.println("a의 아이디: "+a.getId());
        System.out.println("b의 아이디: "+b.getId());

        System.out.println("부여한 아이디 개수 : "+ Id.getCounter());
    }
}
