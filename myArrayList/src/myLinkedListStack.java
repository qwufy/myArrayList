import java.util.EmptyStackException;
import java.util.LinkedList;

public class myLinkedListStack<E> {
    private myLinkedList<E> stack;

    public myLinkedListStack(){
        stack = new myLinkedList<>();
    }

    public void push(E element){
        stack.add(element, 0);
    }

    public E pop() {
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.remove(0);
    }

    public E peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack.get(0);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();
    }
}
