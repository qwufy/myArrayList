
public interface myList<T> {
    int size();
    boolean contains(Object o);
    void add(T item);
    void add(T item, int index);
    boolean remove(T item);
    T remove(int index);
    void clear();
    T get (int index);
    int indexOf(Object o);
    int lastIndex(Object o);
    void sort();
}
