import java.util.*;

public class MyList<E> implements List, Iterable {

    private int size;
    private E[] elements;
    private static final int DEFAULT_CAPACITY = 10;

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size == 0)
            return true;
        return false;
    }

    @Override
    public boolean contains(Object o) {

        for (int i = 0; i < size; i++) {
            if(elements.equals(o))
                return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {

        if(size == elements.length)
            doubleArraySize();

        elements[size++] = (E) o;

        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }



    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {

        if(index > size)
            return null; // is this correct?

        return elements[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

        if(index > size)
            return;

        if(size == elements.length)
            doubleArraySize();

        elements[index] = (E) element;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    /*
        PRIVATE METHODS
     */

    private void doubleArraySize() {

        int newSize = 2 * size;
        Object[] temp = new Object[newSize];

        for (int i = 0; i < elements.length; i++) {
            temp[i] = elements[i];
        }

        elements = (E[]) temp;
        size = newSize;
    }

    /*
        Unsupported methods
     */

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException();
    }
}
