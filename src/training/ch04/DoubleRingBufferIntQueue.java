package training.ch04;

public class DoubleRingBufferIntQueue {
    private int[] que;          //규용 배열
    private int capacity;       //큐의 용량

    //A큐
    private int frontA;          //A큐 맨 앞의 요소 커서
    private int rearA;           //A큐 맨 뒤의 요소 커서
    private int numA;            //A큐 현재 데이터 개수

    //B큐
    private int frontB;           //B큐 맨 앞의 요소 커서
    private int rearB;            //B큐 맨 뒤의 요소 커서
    private int numB;             //B큐 현재 데이터 개수


    //실행 시 예외 : 큐가 비어 있음
    public class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException(){}
    }
    //실행 시 예외 : 큐가 가득 참
    public class OverflowIntQueueExcption extends RuntimeException{
        public OverflowIntQueueExcption(){}
    }

    public DoubleRingBufferIntQueue(int maxlen){
        capacity = maxlen;
        numA = frontA = rearA = 0;
        numB = frontB = rearB = capacity - 1;
        try {
            que = new int[capacity];        //큐 본체용 배열을 생성
        } catch (OutOfMemoryError e){       //생성할 수 없음
            capacity = 0;
        }
    }
    //A큐에 데이터를 인큐
    public int enqueA(int x) throws OverflowIntQueueExcption{
        if (numA >= capacity / 2){
            throw new OverflowIntQueueExcption();   //큐가 가득 참
        }
        que[rearA++] = x;
        numA++;
        if (rearA == capacity / 2){
            rearA = 0;
        }
        return x;
    }
    //B큐에 데이터를 인큐
    public int enqueB(int x) throws OverflowIntQueueExcption{
        if (numB <= capacity / 2){
            throw new OverflowIntQueueExcption();   //큐가 가득 참
        }
        que[rearB--] = x;
        numB--;
        if (rearB == capacity / 2){
            rearB = capacity - 1;
        }
        return x;
    }

    //A큐에서 데이터를 디큐
    public int dequeA() throws EmptyIntQueueException{
        if (numA <= 0){
            throw new EmptyIntQueueException();     //큐가 비어있음
        }
        int x = que[frontA++];
        numA--;
        if (frontA == capacity / 2){
            frontA = 0;
        }
        return x;
    }
    //B큐에서 데이터를 디큐
    public int dequeB() throws EmptyIntQueueException{
        if (numB >= capacity - 1){
            throw new EmptyIntQueueException();     //큐가 비어있음
        }
        int x = que[frontB--];
        numB++;
        if (frontB == capacity / 2){
            frontB = capacity - 1;
        }
        return x;
    }

    //A큐에서 데이터를 피크(프런트 데이터를 들여다봄)
    public int peekA() throws EmptyIntQueueException{
        if (numA <= 0){
            throw new EmptyIntQueueException();
        }
        return que[frontA];
    }
    //B큐에서 데이터를 피크(프런트 데이터를 들여다봄)
    public int peekB() throws EmptyIntQueueException{
        if (numB >= capacity){
            throw new EmptyIntQueueException();
        }
        return que[frontB];
    }

    //A큐를 비움
    public void clearA(){
        numA = frontA = rearA = 0;
    }

    //B큐를 비움
    public void clearB(){
        numB = frontB = rearB = capacity - 1;
    }

    //A 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
    public int indexOfA(int x){
        for (int i = 0; i < numA; i++){
            int idx = (i + frontA) % capacity;
            if (que[idx] == x){
                return idx;
            }
        }
        return -1;
    }

    //B 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
    public int indexOfB(int x){
        for (int i = capacity; i > numB; i--){
            int idx = (i + frontB) % capacity;
            if (que[idx] == x){
                return idx;
            }
        }
        return -1;
    }


    //A,B 큐의 용량을 반환
    public int getCapacity(){
        return capacity / 2 ;
    }


    //A 큐에 쌓여 있는 데이터 개수를 반환
    public int sizeA(){
        return numA;
    }

    //B 큐에 쌓여 있는 데이터 개수를 반환
    public int sizeB(){
        return  (capacity - numB) - 1;
    }

    //A큐가 비어 있나요?
    public boolean isEmptyA(){
        return numA <= 0;
    }
    //B큐가 비어 있나요?
    public boolean isEmptyB(){
        return numB >= capacity;
    }

    //A큐가 가득 찼나요?
    public boolean isFullA(){
        return numA >= capacity / 2;
    }
    //B큐가 가득 찼나요?
    public boolean isFullB(){
        return numB <= capacity / 2;
    }



    //A큐 안의 모든 데이터를 프런트 -> 리어 순서로 출력
    public void dumpA(){
        if (numA <= 0){
            System.out.println("큐가 비어 있습니다.");
        }
        else{
            for (int i = 0; i < numA; i++){
                System.out.print(que[(i + frontA) % capacity] + " ");
            }
            System.out.println();
        }
    }
    //B큐 안의 모든 데이터를 프런트 -> 리어 순서로 출력
    public void dumpB(){
        if (numB >= capacity - 1){
            System.out.println("큐가 비어 있습니다.");
        }
        else{
            for (int i = capacity; i > numB + 1; i--){
                System.out.print(que[(i + frontB) % capacity] + " ");
            }
            System.out.println();
        }
    }


}
