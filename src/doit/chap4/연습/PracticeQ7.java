package doit.chap4.연습;

//deque만들기 int 형으로

public class PracticeQ7 {
    private int[] dequeue;
    private int capacity;
    private int front;
    private int rear;
    private int num;

    public static class EmptyIntStackException extends RuntimeException { //스택이 비어 있을 때 예외처리
        public EmptyIntStackException() {
        }
    }

    public static class OverflowIntStackException extends RuntimeException { //스택이 가득 차 있을 때 예외처리
        public OverflowIntStackException() {
        }
    }

    public static class NoExistIndexException extends RuntimeException {
        public NoExistIndexException() {}
    }

    public PracticeQ7(int max) {
        front = rear = 0;
        capacity = max;
        try {
            dequeue = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int enque_front(int x) throws OverflowIntStackException { //프론트 앞에 x를 넣고 front-1
        if (num >= capacity) {
            throw new OverflowIntStackException();
        }
        dequeue[front - 1] = x;
        front--;
        num++;
        if (front <= 0) {
            throw new NoExistIndexException();
        }
        return x;
    }

    public int enque_rear(int x) throws OverflowIntStackException { //rear 뒤에 x넣고 rear+1
        if (num >= capacity) {
            throw new OverflowIntStackException();
        }
        dequeue[rear + 1] = x;
        rear++;
        num++;
        if (rear == capacity) {
            throw new OverflowIntStackException();
        }
        return x;
    }

    public int deque_front() throws EmptyIntStackException { //현재 프론트 요소값 리턴하고 front+1
        if (num <= 0) {
            throw new EmptyIntStackException();
        }
        int x = dequeue[front++];
        num--;
        if (front == capacity) {
            throw new EmptyIntStackException();
        }
        return x;
    }

    public int deque_rear() throws EmptyIntStackException { //현재 rear값 반환하고 rear-1
        if (num <= 0) {
            throw new EmptyIntStackException();
        }
        int x = dequeue[rear--];
        num--;
        if (rear == 0) {
            throw new EmptyIntStackException();
        }
        return x;
    }

}
