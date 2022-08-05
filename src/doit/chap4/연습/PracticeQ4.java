package doit.chap4.연습;

public class PracticeQ4 {
    private int[] que; //큐용 배열
    private int capacity; //큐 용량
    private int num; //현재 데이터 개수

    public static class EmptyIntStackException extends RuntimeException { //스택이 비어 있을 때 예외처리
        public EmptyIntStackException() {}
    }

    public static class OverflowIntStackException extends RuntimeException{ //스택이 가득 차 있을 때 예외처리
        public OverflowIntStackException() {}
    }

    public PracticeQ4(int maxlen) { //생성자
        num = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int enque(int x)throws OverflowIntStackException{ //enque
        if (num >= capacity) {
            throw new OverflowIntStackException();
        }
        que[num]=x; //1개 인큐 되면 que[1]부터 인큐가 됨
        num++;
        return x; //인큐한 값 반환
    }
    public int deque() throws EmptyIntStackException{ //deque
        if (num<=0){
            throw new EmptyIntStackException();
        }
        for (int i =1;i<=num; i++) {  //왼쪽으로 한칸씩 값을 옮긴후에 q[0]값 출력
            que[i-1]=que[i];
        }
        return que[0];
    }
    public int peek() throws EmptyIntStackException{ //프론트 데이터를 들여다봄
        if (num<=0){
            throw new EmptyIntStackException();
        }
        return que[1]; //프론트는 항상 que[1]임
    }
    public void clear(){ //큐를 비움
        num = 0; //num에 의해 모든 작용이 일어나므로 데이터수가 0이면 모두 비움
    }
    public int indexOf(int x){ //큐에서 x를 검색하여 인덱스를 반환(선형 검색)
        for (int i = 1; i <= num; i++) { //1에서 총 데이터 개수만큼 검색
            if (que[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public int getCapacity(){
        return capacity;
    }
    public int size(){
        return num;
    }
    public boolean isEmpty(){
        return num<=0;
    }
    public boolean isFull(){
        return num>=capacity;
    }
    public void dump(){ //큐 안의 모든 데이터를 프런트->리어 순으로 출력
        if (num<=0) {
            System.out.println("큐가 빔");
        }else  {
            for (int i = 1; i <= num; i++) {
                System.out.print(que[i]+"  ");
            }
        }
    }
}
