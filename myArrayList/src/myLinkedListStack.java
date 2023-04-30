import java.util.EmptyStackException;

public class myLinkedListStack<E> {
    private myLinkedList<E> list;

    public myLinkedListStack(){
        list = new myLinkedList<>();
    }

    public void push(E element){
        list.add(element);
    }

    public E pop() {
        if (list.isEmpty()){
            throw new EmptyStackException();
        }
        return list.remove();
    }
}
