public class myArrayListStack {
    private myArrayList<Integer> list;

    public myArrayListStack(){
        list = new myArrayList<>();
    }

    public void push(int value){
        list.add(value);
    }
}
