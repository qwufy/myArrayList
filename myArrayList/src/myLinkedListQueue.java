import java.awt.*;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class myLinkedListQueue<T> {
    private LinkedList<T> list;

    public myLinkedListQueue(){
        list = new LinkedList<T>();
    }

    public  void enqueue(T value){
        list.addLast(value);
    }

    public T dequeue(){
        if(list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.removeFirst();
    }

    public T peek(){
        if(list.isEmpty()){
            throw new NoSuchElementException();
        }
        return list.getFirst();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }
}
