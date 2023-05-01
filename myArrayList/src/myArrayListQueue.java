import java.util.ArrayList;

public class myArrayListQueue<T> {
    private ArrayList<T> list;

    public myArrayListQueue(){
        list = new ArrayList<T>();
    }

    public void enqueue(T value){
        list.add(value);
    }
}
