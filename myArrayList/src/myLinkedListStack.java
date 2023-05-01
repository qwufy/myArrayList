import java.util.EmptyStackException;

public class myLinkedListStack<T> implements StackList<T>, Iterable<T> {
    private linkedList<T> linkedList;

    linkedList(){
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
    public boolean isEmpty(){}
}