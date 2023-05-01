import java.util.EmptyStackException;
import java.util.Iterator;

public class myLinkedListStack<T> implements StackList<T>, Iterable<T> {
    private myLinkedList<T> linkedList;

    public myLinkedListStack() {
        linkedList = new linkedList<>();
    }


    @Override
    public void push(T element){
        linkedList.add(element,0);
    }

    @Override
    public T pop(){
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return linkedList.remove(0);
    }

    @Override
    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return linkedList.get(0);
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
        return myLinkedList.iterator();
    }
}