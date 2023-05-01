import java.util.EmptyStackException;
import myArrayList.MyArrayList; // if implementing MyArrayListStack
import myLinkedList.MyLinkedList; // if implementing MyLinkedListStack

import static sun.util.locale.LocaleUtils.isEmpty;

public class myLinkedListStack {
    private myLinkedList list;

    public myLinkedListStack(){
        list = new myLinkedList();
    }

    public void push(int value){
        list.addFirst(value);
    }

    public int pop(){
        if(list.isEmpty()){
            throw new EmptyStackException();
        }
        return list.getFirst();
    }

    public int size(){
        return list.size();
    }
}

public class myArrayListStack{
    private myArrayList list;


}
