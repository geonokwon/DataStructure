package training.ch04;

public class RingBufferGenericsQueue<E> {
    private E[] que;          //규용 배열
    private int capacity;       //큐의 용량
    private int front;          //맨 앞의 요소 커서
    private int rear;           //맨 뒤의 요소 커서
    private int num;            //현재 데이터 개수

    //실행 시 예외 : 큐가 비어 있음
    public static class EmptyGQueueException extends RuntimeException{
        public EmptyGQueueException(){}
    }
    //실행 시 예외 : 큐가 가득 참
    public static class OverflowGQueueExcption extends RuntimeException{
        public OverflowGQueueExcption(){}
    }

    public RingBufferGenericsQueue(int maxlen){
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = (E[])new Object [capacity];        //큐 본체용 배열을 생성
        } catch (OutOfMemoryError e){       //생성할 수 없음
            capacity = 0;
        }
    }
    //큐에 데이터를 인큐
    public E enque(E x) throws OverflowGQueueExcption{
        if (num >= capacity){
            throw new OverflowGQueueExcption();   //큐가 가득 참
        }
        que[rear++] = x;
        num++;
        if (rear == capacity){
            rear = 0;
        }
        return x;
    }
    //큐에서 데이터를 디큐
    public E deque() throws EmptyGQueueException{
        if (num <= 0){
            throw new EmptyGQueueException();     //큐가 비어있음
        }
        E x = que[front++];
        num--;
        if (front == capacity){
            front = 0;
        }
        return x;
    }
    //큐에서 데이터를 피크(프런트 데이터를 들여다봄)
    public E peek() throws EmptyGQueueException{
        if (num <= 0){
            throw new EmptyGQueueException();
        }
        return que[front];
    }

    //큐를 비움
    public void clear(){
        num = front = rear = 0;
    }

    //큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
    public int indexOf(E x){
        for (int i = 0; i < num; i++){
            int idx = (i + front) % capacity;
            if (que[idx] == x){
                return idx;
            }
        }
        return -1;
    }
    //큐의 용량을 반환
    public int getCapacity(){
        return capacity;
    }
    //큐에 쌓여 있는 데이터 개수를 반환
    public int size(){
        return num;
    }

    //큐가 비어 있나요?
    public boolean isEmpty(){
        return num <= 0;
    }

    //큐가 가득 찼나요?
    public boolean isFull(){
        return num >= capacity;
    }

    //큐 안의 모든 데이터를 프런트 -> 리어 순서로 출력
    public void dump(){
        if (num <= 0){
            System.out.println("큐가 비어 있습니다.");
        }
        else{
            for (int i = 0; i < num; i++){
                System.out.print(que[(i + front) % capacity] + " ");
            }
            System.out.println();
        }
    }

    //큐 안의 front 부터 rear 까지의 데이터만 을 검색해서 front 부터의 순서로 순번 출력
    public int search(E y) throws EmptyGQueueException{
        if (num <= 0){
            throw new EmptyGQueueException();
        }
        else {
            for (int i = front; i <= num; i++){
                if (que[(i + front) % capacity].equals(y)) {
                    return i + 1;
                }
            }
        }
        return 0;
    }
}
