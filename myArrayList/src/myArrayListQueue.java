import java.util.ArrayList;
import java.util.NoSuchElementException;

public class myArrayListQueue<T> {
    private ArrayList<T> list;

    public myArrayListQueue(){
        list = new ArrayList<T>();
    }

    public void enqueue(T value){
        list.add(value);
    }

    public T dequeue(){
        if(list.isEmpty()){
            throw new NoSuchElementException();
        }
        return list.remove(0);
    }

    public T peek(){
        if(list.isEmpty()){
            throw new NoSuchElementException();
        }
        return list.get(0);
    }
}
