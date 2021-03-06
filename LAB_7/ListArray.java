import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListArray<T> extends AbstractCollection<T> implements List<T> {
    private T[] array;
    private int capacity;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public ListArray() {
        capacity = 10;
        array = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public ListArray(int capacity) {
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListArrayIterator<T>(this);
    }

    @Override
    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void add(int index, T element) {
        if (index >= capacity) {
            capacity *= 2;
            T[] arrayCopy = array;
            array = (T[]) new Object[capacity];
            for (int i = 0; i < arrayCopy.length; i++) {
                array[i] = arrayCopy[i];
            }
        }
        size += index == size ? 1 : 0;
        array[index] = element;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        List<T> subArray = subList(index, size);
        Iterator<? extends T> t = c.iterator();
        for (int i = 0; i < c.size(); i++) {      
            this.add(i + index, t.next());
        }
        
        for (int i = 0; i < subArray.size(); i++) {
            this.add(subArray.get(i));
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        Iterator<? extends T> t = c.iterator();

        int lesser = size + c.size();

        for (int i = size; i < lesser; i++) { 
            this.add(t.next());
        }
        return true;
    }

    @Override
    public T get(int index) {
        return (T)array[index];
    }

    @Override
    public int indexOf(Object o) {
        int res = -1;
        for (int i = 0; i < size; i++) {
            res = (Integer)array[i] == o ? i : res;
            if (res != -1) break;
        }
        return res;
    }

    @Override
    public int lastIndexOf(Object o) {
        int res = -1;
        for (int i = size - 1; i >= 0; i--) {
            res = (Integer)array[i] == o ? i : res;
            if (res != -1) break;
        }
        return res;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        ListArray<T> subArray = new ListArray<>(toIndex - fromIndex);
        for (int i = 0; i < toIndex - fromIndex; i++) {
            subArray.add(array[fromIndex + i]);
        }
        return subArray;
    }

    @Override
    public boolean add(T e) {
        try {
            add(size, e);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return true;
    }

}