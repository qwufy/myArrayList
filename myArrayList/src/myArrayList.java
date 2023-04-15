public class myArrayList<T> implements myList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;


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
        if(size == elements.length){
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
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
