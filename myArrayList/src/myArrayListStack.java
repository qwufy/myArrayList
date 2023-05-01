import java.util.EmptyStackException;

public class myArrayListStack {
    private myArrayList list;

    public myArrayListStack() {
        list = new myArrayList();
    }

    public void push(int value) {
        list.add(value);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}
