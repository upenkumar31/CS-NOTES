# **ArrayList**

`public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable`


1. Java ArrayList class uses a dynamic array for storing the elements
2. It is like an array, but there is no size limit
3. It implements the List interface, so we can use all the methods of List interface here
4. Java ArrayList class can contain duplicate elements.
5.  Java ArrayList class maintains insertion order.
6.  Java ArrayList class is non synchronized.
7.  Java ArrayList allows random access because array works at the index basis.
8. In ArrayList, manipulation is little slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.


# **LinkedList**

`public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable  
`

1. Java LinkedList class uses a doubly linked list to store the elements. 
2. It provides a linked-list data structure. 
3. It inherits the AbstractList class and implements List and Deque interfaces
4. Java LinkedList class can contain duplicate elements.
5. Java LinkedList class maintains insertion order.
6. Java LinkedList class is non synchronized.
7. In Java LinkedList class, manipulation is fast because no shifting needs to occur.
8. Java LinkedList class can be used as a list, stack or queue.

#  **HashSet**

1. HashSet stores the elements by using a mechanism called hashing.
2. HashSet contains unique elements only.
3. HashSet allows null value.
4. HashSet class is non synchronized.
5. HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
6. HashSet is the best approach for search operations.
   7.The initial default capacity of HashSet is 16, and the load factor is 0.75.