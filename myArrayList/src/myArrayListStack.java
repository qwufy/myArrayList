import java.util.EmptyStackException;

public class myArrayListStack {
    private myArrayList<Integer> list;

    public myArrayListStack(){
        list = new myArrayList<>();
    }

    public void push(int value){
        list.add(value);
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty(){
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}
