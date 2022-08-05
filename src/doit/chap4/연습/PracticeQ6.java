package doit.chap4.연습;

//Generic ring형 Queue만들기

import doit.chap4.실습.FourToThree;

public class PracticeQ6<E> {
    private E[] que; //스택용 배열
    private int capacity; //스택 용량
    private int front;
    private int rear;
    private int num;

    public static class EmptyIntStackException extends RuntimeException { //스택이 비어 있을 때 예외처리
        public EmptyIntStackException() {}
    }

    public static class OverflowIntStackException extends RuntimeException{ //스택이 가득 차 있을 때 예외처리
        public OverflowIntStackException() {}
    }

    public PracticeQ6(int maxlen) { //생성자
        num=front=rear = 0;
        capacity = maxlen;
        try {
            que = (E[]) new  Object[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public E enque(E x)throws PracticeQ6.OverflowIntStackException { //enque
        if (num >= capacity) {
            throw new PracticeQ6.OverflowIntStackException();
        }
        que[rear++]=x;
        num++;
        if (rear == capacity) {
            rear = 0;
        }
        return x;
    }

    public E deque() throws PracticeQ6.EmptyIntStackException { //deque
        if (num<=0){
            throw new PracticeQ6.EmptyIntStackException();
        }
        E x = que[front++];
        num--;
        if (front == capacity) {
            front=0;
        }
        return x;
    }
    public E peek() throws PracticeQ6.EmptyIntStackException { //프론트 데이터를 들여다봄
        if (num<=0){
            throw new PracticeQ6.EmptyIntStackException();
        }
        return que[front];
    }
    public void clear(){ //큐를 비움
        num=front=rear = 0;
    }
    public int indexOf(int x){ //큐에서 x를 검색하여 인덱스를 반환(선형 검색)
        for (int i = 1; i <= num; i++) {
            int idx =(i+front) % capacity;
            if (que[idx].equals(x)) {
                return idx;
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
                System.out.print(que[(i+front)%capacity]+"  ");
            }
        }
    }
}
