package doit.chap4.연습;

//하나의 배열로 2개의 스택 구현

public class PracticeQ3 {
    private int[] stk; //스택용 배열
    private int capacity; //스택 용량
    private int ptr_a; //스택 포인터
    private int ptr_b;

    public static class EmptyIntStackException extends RuntimeException { //스택이 비어 있을 때 예외처리
        public EmptyIntStackException() {}
    }

    public static class OverflowIntStackException extends RuntimeException{ //스택이 가득 차 있을 때 예외처리
        public OverflowIntStackException() {}
    }

    public PracticeQ3(int maxlen) { //생성자
        ptr_a = 0;
        ptr_b = maxlen-1;
        capacity = maxlen; //배열의 용량
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int push_a(int a) throws PracticeQ3.OverflowIntStackException { //스택에 x를 '푸쉬'
        if (ptr_a==ptr_b){ //스택이 가득 참
            throw new PracticeQ3.OverflowIntStackException();
        }
        return stk[ptr_a++]=a;
    }
    public int push_b(int b) throws PracticeQ3.OverflowIntStackException { //스택에 x를 '푸쉬'
        if (ptr_a==ptr_b){ //스택이 가득 참
            throw new PracticeQ3.OverflowIntStackException();
        }
        return stk[ptr_b--]=b;
    }

    public int pop_a() throws PracticeQ3.EmptyIntStackException { //'팝!'
        if (ptr_a<= 0) { //스택이 비어있다.
            throw new PracticeQ3.EmptyIntStackException();
        }
        return stk[--ptr_a];
    }
    public int pop_b() throws PracticeQ3.EmptyIntStackException { //'팝!'
        if (ptr_b >= capacity) { //스택이 비어있다.
            throw new PracticeQ3.EmptyIntStackException();
        }
        return stk[++ptr_b];
    }

    public int peek_a() throws PracticeQ3.EmptyIntStackException { //peek
        if (ptr_a<=0){ //스택이 빔
            throw new PracticeQ3.EmptyIntStackException();
        }
        return stk[ptr_a-1]; //스택 포인터가 가르키는 값-1
    }
    public int peek_b() throws PracticeQ3.EmptyIntStackException { //peek
        if (ptr_b >= capacity) { //스택이 빔
            throw new PracticeQ3.EmptyIntStackException();
        }
        return stk[ptr_b+1]; //스택 포인터가 가르키는 값+1
    }

    /**
     * 스택이 가득 차 있는가? : if (ptr == capacity)
     * 스택이 비어 있는가? : if (ptr == 0)
     */

    public void clear_a() { //스택을 비움
        ptr_a = 0;
    }
    public void clear_b() { //스택을 비움
        ptr_b = capacity;
    }

    public int indexOf_a(int x) { //x찾기 위해서 peek부터 선형 검색
        for (int i = ptr_a - 1; i >= 0; i--) {
            if (stk[i] == x){
                return i;
            }
        }
        return -1;
    }
    public int indexOf_b(int x) { //x찾기 위해서 peek부터 선형 검색
        for (int i = ptr_b + 1; i <= capacity; i++) {
            if (stk[i] == x){
                return i;
            }
        }
        return -1;
    }

    public int getCapacity_a() { //스택 용량 반환
        return capacity-ptr_b;
    }
    public int getCapacity_b() { //스택 용량 반환
        return capacity-ptr_a;
    }

    public int size_a() { //스택이 얼마나 쌓여잇나?
        return ptr_a;
    }
    public int size_b() { //스택이 얼마나 쌓여잇나?
        return ptr_b;
    }

    public boolean isEmpty_a(){ //스택이 비어 있나?
        return ptr_a<=0;
    }
    public boolean isEmpty_b(){ //스택이 비어 있나?
        return ptr_b>=capacity;
    }

    public boolean isFull_a() { //스택이 가득 찼나?
        return ptr_a>=capacity;
    }
    public boolean isFull_b() { //스택이 가득 찼나?
        return ptr_b<=0;
    }

    public void dump_a() { //스택을 바텀에서 탑순으로 출력
        if (ptr_a <= 0) {
            System.out.println("스택 빔");
        }else {
            for (int i = 0; i < ptr_a; i++) {
                System.out.print(stk[i]+" ");
            }
            System.out.println();
        }
    }
    public void dump_b() { //스택을 바텀에서 탑순으로 출력
        if (ptr_b >= capacity) {
            System.out.println("스택 빔");
        }else {
            for (int i = capacity; i > ptr_b; i--) {
                System.out.print(stk[i]+" ");
            }
            System.out.println();
        }
    }
}