package training.ch04;

public class DoubleIntStack_question_3 {
    //한 배엘에 앞쪽에서 실행하는 A 스택 뒤쪽에서 실행하는 B 스택 한가지 배열에서 두가지 스택구현
    private  int[] stk;     //stack 용 배열
    private int capacity;   //stack 용량
    private int ptrA;        //A stack 포인터
    private int ptrB;        //B stack 포인터

    //실행 시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){}
    }
    //실행 시 예외 : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){}
    }

    //생성자
    public DoubleIntStack_question_3(int maxlen){
        capacity = maxlen;
        ptrA = 0;
        ptrB = capacity - 1;
        try{
            stk = new int[capacity];        //스택 본체용 배열을 생성
        } catch (OutOfMemoryError e){       //생성할 수 없음
            capacity = 0;
        }
    }
    //A 스택에 x 푸쉬 (앞쪽 푸쉬)
    public int aPush (int x) throws OverflowIntStackException {
        if (ptrA >= capacity / 2){               //스택이 가득 참
            throw new OverflowIntStackException();
        }
        return stk[ptrA++] = x;
    }
    //B 스택에 x 푸쉬 (뒤쪽 푸쉬)
    public int bPush (int y) throws IntStack.OverflowIntStackException{
        if (ptrB <= capacity / 2){              //스택이 가득 참
            throw new OverflowIntStackException();
        }
        return stk[ptrB--] = y;
    }

    //A 스택에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)
    public int aPop () throws EmptyIntStackException {
        if (ptrA <= 0){                      //스택이 비어있음
            throw new EmptyIntStackException();
        }
        return stk[--ptrA];
    }

    //B 스택에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)
    public int bPop () throws EmptyIntStackException {
        if (ptrB >= capacity){                      //스택이 비어있음
            throw new EmptyIntStackException();
        }
        return stk[++ptrB];
    }

    //A 스택에서 데이터를 피크(꼭대기에 있는 데이터를 들여다봄)
    public int aPeek() throws EmptyIntStackException {
        if (ptrA <= 0){                      //스택이 비어있음
            throw new EmptyIntStackException();
        }
        return stk[ptrA - 1];
    }
    //B 스택에서 데이터를 피크(꼭대기에 있는 데이터를 들여다봄)
    public int bPeek() throws EmptyIntStackException {
        if (ptrA >= capacity){                      //스택이 비어있음
            throw new EmptyIntStackException();
        }
        return stk[ptrB + 1];
    }

    //A 스택을 비움
    public void aClear() {
        ptrA = 0;
    }
    //B 스택을 비움
    public void bClear() {
        ptrB = capacity - 1;
    }


    //A 스택에서 x를 찾아 인덱스(없으면 -1)를 반환
    public int aIndexOf(int x){
        for (int i = ptrA - 1; i >= 0; i--){ //꼭대기 쪽부터 선형검색
            if (stk[i] == x){
                return i;                   //검색성공
            }
        }
        return -1;                          //검색실패
    }

    //B 스택에서 y를 찾아 인덱스(없으면 -1)를 반환
    public int bIndexOf(int y){
        for (int i = ptrB + 1; i <= capacity - 1; i++){ //꼭대기 쪽부터 선형검색
            if (stk[i] == y){
                return i;                   //검색성공
            }
        }
        return -1;                          //검색실패
    }


    //A,B 스택의 용량을 반환
    public int getCapacity(){
        return capacity/2;
    }

    //A 스택에 쌓여 있는 데이터 개수를 반환
    public int aSize(){
        return ptrA;
    }
    //B 스택에 쌓여 있는 데이터 개수를 반환
    public int bSize(){
        return capacity - 1 - ptrB;
    }

    //A 스택이 비어 있는가?
    public boolean aIsEmpty(){
        return ptrA <= 0;
    }
    //B 스택이 비어 있는가?
    public boolean bIsEmpty(){
        return ptrB <= capacity;
    }

    //A 스택이 가득 찼는가?
    public boolean aIsFull(){
        return ptrA >= capacity/2;
    }
    //B 스택이 가득 찼는가?
    public boolean bIsFull(){
        return ptrB >= capacity/2;
    }


    //A 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void aDump(){
        if (ptrA <= 0){
            System.out.println("스택이 비어있습니다.");
        }
        else {
            for (int i = 0; i < ptrA; i++){
                if (i == 0){
                    System.out.print("{ ");
                }
                System.out.print(stk[i] + ", ");
            }
            System.out.print("}");
            System.out.println();
        }
    }
    //B 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void bDump(){
        if (ptrB >= capacity - 1){
            System.out.println("스택이 비어있습니다.");
        }
        else {
            for (int i = capacity - 1; i > ptrB; i--){
                if (i == capacity - 1){
                    System.out.print("{ ");
                }
                System.out.print(stk[i] + ", ");
            }
            System.out.print("}");
            System.out.println();
        }
    }
}
