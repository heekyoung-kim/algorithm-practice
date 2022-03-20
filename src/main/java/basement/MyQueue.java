package basement;

import java.util.ArrayList;

public class MyQueue<T> {

    private ArrayList<T> queue = new ArrayList<T>();
    
    public void enqueue(T item){
        queue.add(item);
    }
    
    public T dequeue(){
        if(queue.isEmpty()){
            return null;
        }
        return queue.remove(0); // arraylist의 경우 삭제할 인덱스를 지정해줘야함.
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    public static void main(String[] args){
        MyQueue<Integer> mq = new MyQueue<Integer>();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());
    }
}
