public class myLinkedList<T> implements myList<T> {

    private class Node{
        private T element;
        private Node next;
        private Node previous;

        public Node(T element){
            this.element = element;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    private myLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void add(T item) {

    }

    @Override
    public void add(T item, int index) {

    }

    @Override
    public boolean remove(T item) {
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndex(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }

}
