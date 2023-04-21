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
        Node currentNode = head;
        while (currentNode != null){
            if(currentNode.element.equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(T item) {
        Node newNode = new Node(item);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(T item, int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if(index == size){
            add(item);
        }
        else {
            Node newNode = new Node(item);
            if(index == 0){
                newNode.next = head;
                head.previous = newNode;
                head = newNode;
            }
            else{
                Node currentNode;
                if(index <= size / 2){
                    currentNode = head;
                    for (int i = 0; i < index; i++){
                        currentNode = currentNode.next;
                    }
                }
                else{
                    currentNode = tail;
                    for(int i = size - 1; i > index; i--){
                        currentNode = currentNode.previous;
                    }
                }
                newNode.previous = currentNode.previous;
                newNode.next = currentNode.next;
                currentNode.previous.next = newNode;
                currentNode.previous = newNode;
            }
            size++;
        }
    }

    @Override
    public boolean remove(T item) {
        Node currentNode = head;
        while (currentNode != null){
            if(currentNode.element.equals(item)){
                if(currentNode.previous != null){
                    currentNode.previous.next = currentNode.next;
                }
                else{
                    head = currentNode.next;
                }
                if(currentNode.next != null){
                    currentNode.next.previous = currentNode.previous;
                }
                else{
                    tail = currentNode.previous;
                }
                size--;
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        T removedItem;
        if (index == 0) {
            removedItem = head.element;
            head = head.next;
        } else if (index == size - 1) {
            removedItem = tail.element;
            tail = tail.previous;
        } else {
            Node currentNode;
            if (index <= size / 2) {
                currentNode = head;
                for (int i = 0; i < index; i++) {
                    currentNode = currentNode.next;
                }
            } else {
                currentNode = tail;
                for (int i = size - 1; i > index; i++)
                     currentNode = tail;
                for (int i = size - 1; i > index; i--) {
                    currentNode = currentNode.previous;
                }
            }
            removedItem = currentNode.element;
            currentNode.previous.next = currentNode.next;
            currentNode.next.previous = currentNode.previous;
        }
        size--;
        return removedItem;
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
