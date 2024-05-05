package training.ch04;

public class IntArrayQueue {
    private int[] que;          //큐용 배열
    private int capacity;       //큐 용량
    private int num;            //현재 데이터 개수

    public IntArrayQueue(int maxlen){
        num = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e){
            capacity = 0;
        }
    }
    public void enQueue(int x){
        que[num++] = x;
    }
    public int deQueue(){
        int y = que[0];
        if (num <= 0){
            System.out.println("큐에 데이터가 없습니다.");
        }
        else {
            for (int i = 0; i < num; i++) {
                que[i] = que[i + 1];
            }
        }
        if (num != 0) {
            num--;
        }
        else
            num = 0;

        return y;
    }
    public void dump(){
        if (num <= 0){
            System.out.println("큐에 데이터가 없습니다.");
        }
        else {
            for (int i = 0; i < num; i++){
                System.out.print(que[i] + ",");
            }
            System.out.println();
        }
    }
    public void clear(){
        num = 0;
        System.out.println("클리어 완료 하였습니다.");
    }
    public int size(){
        return num;
    }
    public int getCapacity() {
        return capacity;
    }
}
