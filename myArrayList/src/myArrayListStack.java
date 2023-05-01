import java.util.ArrayList;
import java.util.EmptyStackException;

public class myArrayListStack<T> implements StackList<T>, Iterable<T>{
    private ArrayList<T> arrayList;

    myArrayListStack(){
        arrayList = new ArrayList<>();
    }

    @Override
    public void push(T element){
        arrayList.add(element);
    }

    @Override
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return arrayList.remove(size()-1);
    }

}
