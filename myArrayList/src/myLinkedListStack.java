import java.util.EmptyStackException;
import java.util.Iterator;

public class myLinkedListStack<T> implements StackList<T>, Iterable<T> {
    private linkedList<T> linkedList;

    myLinkedListStack(){
        linkedList = new linkedList<>();
    }

    @Override
    public void push(T element){
        linkedList.addFirst(element);
    }

    @Override
    public T pop(){
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return linkedList.removeFirst();
    }

    @Override
    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return linkedList.getFirst();
    }

    @Override
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

    @Override
    public int size(){
        return linkedList.size();
    }

    @Override
    public Iterator<T> iterator(){
        return linkedList.iterator();
    }
}