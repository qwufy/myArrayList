import java.util.Iterator;
import java.util.NoSuchElementException;

public class myLinkedList<T> implements myList<T> {


    public boolean isEmpty() {
        return isEmpty();
    }

    public void addFirst(int value) {
    }

    public int getFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.value;
    }

    private class Node{
        public int value;
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

    myLinkedList(){
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
        if (head == null){
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
    public void add(int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

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
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index is empty or full.");
        }
        Node currentNode;
        if (index <= size / 2){
            currentNode = head;
            for (int i = 0; i < index; i++){
                currentNode = currentNode.next;
            }
        }
        else{
            currentNode = tail;
            for (int i = size; i > index; i--){
                currentNode = currentNode.previous;
            }
        }
        return currentNode.element;
    }

    @Override
    public int indexOf(Object o) {
        Node currentNode = head;
        for (int index = 0; index < size; index++) {
            if (currentNode.element.equals(o)) {
                return index;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    @Override
    public int lastIndex(Object o) {
        Node currentNode = tail;
        for (int index = size - 1; index >= 0; index--) {
            if (currentNode.element.equals(o)) {
                return index;
            }
            currentNode = currentNode.previous;
        }
        return -1;
    }

    @Override
    public void sort() {
        if (size <= 1) {
            // Already sorted or empty list, no need to sort
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            while (current != null && current.next != null) {
                if (((Comparable<T>) current.element).compareTo(current.next.element) > 0) {
                    // Swap elements in nodes
                    T temp = current.element;
                    current.element = current.next.element;
                    current.next.element = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}

