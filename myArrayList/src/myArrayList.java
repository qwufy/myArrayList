public class myArrayList<T> implements myList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;

    // myArrayList with default capacity
    public myArrayList(){
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // myArraylist with specified capacity
    public myArrayList(int initialCapacity){
        if(initialCapacity < 0) {
            throw new IllegalArgumentException("Initial capacity can't be neagative");
        }
        elements = new Object[initialCapacity];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        for(int i = 0; i < size; i++){
            if (elements[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(T item) {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2]; // If the array is full, create a new array with double the size
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
        elements[size] = item;
        size++;
    }

    @Override
    public void add(int index) {
        if (size < 0 || size <= index){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for(int i = 0; i < size; i++){
            elements[i] = elements[index];
        }
        size++;
    }

    @Override
    public void add(T item, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length); // If the array is full, create a new array with double the size
            elements = newElements;
        }
        System.arraycopy(elements, index, elements, index + 1, size - index); // Shift elements to the right to make space for the new element
        elements[index] = item;
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean remove(T item) {
        for(int i = 0; i < size; i++){
            if(elements[i].equals(item)){
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        T removedItem = (T) elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[size - 1] = null; // Set the last element to null
        size--;

        return removedItem;
    }

    @Override
    public void clear() {
        for(int i = 0; i < size; i++){
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public T get(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        T item = (T) elements[index];
        return item;
    }

    @Override
    public int indexOf(Object o) {
        for(int i = 0; i < size; i++){
            if(elements[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndex(Object o) {
        for(int i = size - 1; i >= 0; i--){
            if(elements[i].equals(o)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sort() {
        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - i - 1; j++){
                Comparable<T> currentItem = (Comparable<T>) elements[j];
                Comparable<T> nextItem = (Comparable<T>) elements[j+1];
                if(currentItem.compareTo((T) nextItem) > 0){
                    Object temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j + 1] = temp;
                }
            }
        }
    }
}
