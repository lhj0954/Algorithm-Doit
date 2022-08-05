package doit.chap4.연습;

//임의의 데이터를 받아서 쌓을 수 있는 제네릭 스택 클래스를 작성하기

public class PracticeQ2<E> {
    private E [] stk; //스택용 배열
    private int capacity; //스택 용량
    private int ptr; //스택 포인터

    public static class EmptyGenericStackException extends RuntimeException { //스택이 비어 있을 때 예외처리
        public EmptyGenericStackException() {}
    }

    public static class OverflowGenericStackException extends RuntimeException{ //스택이 가득 차 있을 때 예외처리
        public OverflowGenericStackException() {}
    }

    public PracticeQ2(int maxlen) { //생성자
        ptr = 0;
        capacity = maxlen;
        try {
            stk = (E[]) new Object[maxlen]; //외워 두자
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public E push(E x) throws doit.chap4.실습.FourToOne.OverflowIntStackException { //스택에 x를 '푸쉬'
        if (ptr>=capacity){ //스택이 가득 참
            throw new PracticeQ2.OverflowGenericStackException();
        }
        return stk[ptr++]=x;
    }

    public E pop() throws doit.chap4.실습.FourToOne.EmptyIntStackException { //'팝!'
        if (ptr <= 0) { //스택이 비어있다.
            throw new PracticeQ2.EmptyGenericStackException();
        }
        return stk[--ptr];
    }

        public E peek() throws doit.chap4.실습.FourToOne.EmptyIntStackException { //peek
        if (ptr<=0){ //스택이 빔
            throw new PracticeQ2.EmptyGenericStackException();
        }
        return stk[ptr-1]; //스택 포인터가 가르키는 값-1
    }

    /**
     * 스택이 가득 차 있는가? : if (ptr == capacity)
     * 스택이 비어 있는가? : if (ptr == 0)
     */

    public void clear() { //스택을 비움
        ptr = 0;
    }

    public int indexOf(int x) { //x찾기 위해서 peek부터 선형 검색
        for (int i = ptr - 1; i >= 0; i--) {
            if (stk[i].equals(x)){ //외워두자
                return i;
            }
        }
        return -1;
    }

    public int getCapacity() { //스택 용량 반환
        return capacity;
    }

    public int size() { //스택이 얼마나 쌓여잇나?
        return ptr;
    }

    public boolean isEmpty(){ //스택이 비어 있나?
        return ptr<=0;
    }

    public boolean isFull() { //스택이 가득 찼나?
        return ptr>=capacity;
    }

    public void dump() { //스택을 바텀에서 탑순으로 출력
        if (ptr <= 0) {
            System.out.println("스택 빔");
        }else {
            for (int i = 0; i < ptr; i++) {
                System.out.print(stk[i]+" ");
            }
            System.out.println();
        }
    }
}
