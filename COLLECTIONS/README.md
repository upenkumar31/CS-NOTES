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
6. HashSet is the best approach for search operations
7.   The initial default capacity of HashSet is 16, and the load factor is 0.75.

# **LinkedHashSet**

`public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, Serializable
`
1. Java LinkedHashSet class is a Hashtable and Linked list implementation of the set interface. It inherits HashSet class and implements Set interface.
2. Java LinkedHashSet class contains unique elements only like HashSet.
3. Java LinkedHashSet class provides all optional set operation and permits null elements.
4. Java LinkedHashSet class is non synchronized.
5. Java LinkedHashSet class maintains insertion order.

# **TreeSet**

`public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable
`
1. Java TreeSet class implements the Set interface that uses a tree for storage. It inherits AbstractSet class and implements the NavigableSet interface. The objects of the TreeSet class are stored in ascending order
2. Java TreeSet class contains unique elements only like HashSet.
3. Java TreeSet class access and retrieval times are quiet fast.
4. Java TreeSet class doesn't allow null element.
5. Java TreeSet class is non synchronized.
6. Java TreeSet class maintains ascending order.


# **PriorityQueue**

`public class PriorityQueue<E> extends AbstractQueue<E> implements Serializable  
`
The PriorityQueue class provides the facility of using queue. But it does not orders the elements in FIFO manner. It inherits AbstractQueue class

# **ArrayDeque**

1. The ArrayDeque class provides the facility of using deque and resizable-array. It inherits AbstractCollection class and implements the Deque interface
2. Unlike Queue, we can add or remove elements from both sides.
3. Null elements are not allowed in the ArrayDeque.
4. ArrayDeque is not thread safe, in the absence of external synchronization.
5. ArrayDeque has no capacity restrictions.
6. ArrayDeque is faster than LinkedList and Stack.


# **Map**

`public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable
`

1. HashMap is the implementation of Map, but it doesn't maintain any order.
2. LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
3. TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
4. Java HashMap contains values based on the key.
5. Java HashMap contains only unique keys.
6. Java HashMap may have one null key and multiple null values.
7. Java HashMap is non synchronized.
8. Java HashMap maintains no order.
9. The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.