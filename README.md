This assignment involves implementing a custom list data structure using two classes, MyArrayList and MyLinkedList, that both implement the MyList interface. The MyList interface specifies a set of methods that a list data structure should have, such as size(), contains(), add(), remove(), get(), indexOf(), lastIndexOf(), sort(), and clear().

The MyArrayList class is implemented using an array to store the elements of the list. It has a private instance variable of type Object[] to hold the elements, and an int variable called size to keep track of the number of elements in the list. The add() method checks if the array is large enough to accommodate the new element, and if not, it creates a new array with double the size of the original array, copies over the elements from the original array, and then adds the new element. Otherwise, it simply adds the new element to the end of the array and increments the size variable. The get() method returns the element at the specified index, and the remove() method removes the element at the specified index, shifting subsequent elements to the left by one position and decrementing the size variable. The size() method returns the size of the list.

The MyLinkedList class is implemented using a linked list data structure, where each element is represented as a Node object that contains a reference to the next and previous nodes in the list. It has private instance variables called head and tail that reference the first and last nodes in the list, respectively, and an int variable called size to keep track of the number of elements in the list. The add() method creates a new Node with the specified element, sets its next reference to null (since it will be the new tail), and its previous reference to the current tail. If the list is empty, it sets both the head and tail references to the new node. Otherwise, it sets the next reference of the current tail to the new node and updates the tail reference to the new node. Finally, it increments the size variable. The get() method traverses the list from the head or tail (depending on which is closer to the specified index) and returns the element at the specified index. The remove() method first traverses the list to the node at the specified index, then updates the next and previous references of the surrounding nodes to remove the node from the list, and decrements the size variable. The size() method returns the size of the list.




ASSIGNMENT 3
In this assignment, I created a class that implements a stacked data structure using either a linked list or an array list as the underlying data structure. Specifically, you needed to create a class called MyLinkedListStack or MyArrayListStack with the following methods, depending on which data structure you chose to use

push(E Element): Adds an element to the top of the stack.
pop(): Removes the top element of the stack and returns it.
peek(): Returns the top element of the stack without removing it.
isEmpty(): Returns true if the stack is empty, false otherwise.
size(): Returns the number of elements in the stack.
To implement these methods, we had to use the corresponding methods in the Java classes LinkedList or ArrayList, depending on which data structure we chose. We also had to handle exceptions, such as throwing an EmptyStackException when we tried to open or view an empty stack.
