import java.awt.*;
import java.util.LinkedList;

public class myLinkedListQueue<T> {
    private LinkedList<T> list;

    public myLinkedListQueue(){
        list = new LinkedList<T>();
    }

    public  void enqueue(T value){
        list.addLast(value);
    }
}
