# **ArrayList**
1. Java ArrayList class uses a dynamic array for storing the elements
2. It is like an array, but there is no size limit
3. It implements the List interface, so we can use all the methods of List interface here
4. Java ArrayList class can contain duplicate elements.
5.  Java ArrayList class maintains insertion order.
6.  Java ArrayList class is non synchronized.
7.  Java ArrayList allows random access because array works at the index basis.
8. In ArrayList, manipulation is little slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.

`public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable`