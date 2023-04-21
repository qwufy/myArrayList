public class testLinkedList {
    public static void main(String[] args) {
        myLinkedList<Integer> myLinkedList = new myLinkedList<>();

        // Test adding elements to the list
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        System.out.println(myLinkedList.toString());

        // Test getting elements from the list
        System.out.println("The first index of list: " + myLinkedList.get(1));

        // Test removing elements from the list
        myLinkedList.remove(0);
        System.out.println("The list after removing the '0' element: " + myLinkedList.toString());

        // Test clearing the list
        myLinkedList.clear();
        System.out.println("The list after clearing: " + myLinkedList.toString());

        // Test checking if list contains an element
        System.out.println("Is the list contains '2'? " + myLinkedList.contains(2));
        System.out.println("Is the list contains '5'? " + myLinkedList.contains(5));

        // Test getting the size of the list
        System.out.println("Size of the list: " + myLinkedList.size());

        // Test sorting the list
        myLinkedList.add(5);
        myLinkedList.add(4);
        myLinkedList.sort();
        System.out.println("The list after sorting: " + myLinkedList.toString());
    }
}
