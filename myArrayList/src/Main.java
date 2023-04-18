public class Main {
    public static void main(String[] args) {
        myArrayList<Integer> myList = new myArrayList<>();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);

        System.out.println("Initial list: " + myList.toString());
        System.out.println("Size of the list: " + myList.size());

        myList.add(5, 2);
        System.out.println("List after adding element 5 at index 2: " + myList.toString());

        myList.remove(1);
        System.out.println("List after removing element at index 1: " + myList.toString());

        System.out.println("Element at index 2: " + myList.get(2));

        System.out.println("Index of element 5: " + myList.indexOf(5));
        System.out.println("Last index of element 5: " + myList.lastIndex(5));

        myList.sort();
        System.out.println("List after sorting: " + myList.toString());
    }
}