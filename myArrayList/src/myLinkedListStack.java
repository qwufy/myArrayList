public class myLinkedListStack<E> {
    private myLinkedList<E> list;

    public myLinkedListStack(){
        list = new myLinkedList<>();
    }

    public void push(E element){
        list.add(element);
    }
}
