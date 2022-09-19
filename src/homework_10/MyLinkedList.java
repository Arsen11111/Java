package homework_10;


import java.util.*;

public class MyLinkedList implements List <Integer>{
    MyNode first;
    MyNode last;

    private static int DEFAULT_CAPACITY = 10;

    private Integer[] array;

    private int size;

    public MyLinkedList() {
        array = new Integer[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    @Override
    public boolean add(Integer element) {
        if (size == DEFAULT_CAPACITY) {
            Integer[] temp = new Integer[2 * DEFAULT_CAPACITY];
            System.arraycopy(array, 0, temp, 0, DEFAULT_CAPACITY);
            array = temp;
        }
        array[size] = element;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public void add(int index, Integer element) {
        if (size == DEFAULT_CAPACITY) {
            Integer[] temp = new Integer[2 * DEFAULT_CAPACITY];
            System.arraycopy(array, 0, temp, 0, DEFAULT_CAPACITY);

            DEFAULT_CAPACITY *= 2;
            array = temp;
        }
        array[size] = element;
        size++;
    }

    @Override
    public Integer set(int index, Integer element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            return array[index] = element;
        }
    }


    @Override
    public Integer get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }


    @Override
    public Integer remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Integer value = array[index];
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
        return value;
    }





    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

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
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }

    private static class MyNode {
        Integer item;
       MyNode next;
        MyNode prev;

        MyNode(MyNode prev, Integer element, MyNode next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
