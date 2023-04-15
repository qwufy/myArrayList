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
        return 0;
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
        add(item, size);
    }

    @Override
    public void add(T item, int index) {
        if(index < 0 || index > size ){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if(size == elements.length){ //Check if the array is large enough to accommodate the new element
            Object[] newElements = new Object[elements.length * 2]; //Create a new array  with double the size of the original array
            System.arraycopy(elements, 0, newElements, 0, size); // Copy over the elements from the original array
            elements = newElements; //Update the new array
        }
        System.arraycopy(elements, index, elements, index+1, size - index);
        elements[index] = item;
        size++;
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
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        T removedItem = (T) elements[index];
        System.arraycopy(elements, index+1,elements,index, size - index);
        elements[size - 1] = null;
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
