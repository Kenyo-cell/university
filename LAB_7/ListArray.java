import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListArray<T> extends AbstractCollection implements List {
    private Object[] array;
    private int capacity;
    private int size = 0;

    public ListArray() {
        capacity = 10;
        array = new Object[10];
    }

    public ListArray(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
    }

    @Override
    public Iterator iterator() {
        return new ListArrayIterator(this);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int index, Object element) {
        if (index >= capacity) {
            capacity *= 2;
            Object[] arrayCopy = array;
            array = new Object[capacity];
            for (int i = 0; i < arrayCopy.length; i++) {
                array[i] = arrayCopy[i];
            }
        }
        size += index == size ? 1 : 0;
        array[index] = element;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        List subArray = subList(index, size);
        Iterator t = c.iterator();
        for (int i = 0; i < c.size(); i++) {      
            this.add(i + index, t.next());
        }
        
        for (int i = 0; i < subArray.size(); i++) {
            this.add(subArray.get(i));
        }
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        Iterator t = c.iterator();

        int lesser = size + c.size();

        for (int i = size; i < lesser; i++) { 
            this.add(t.next());
        }
        return true;
    }

    @Override
    public Object get(int index) {
        return array[index];
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
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        ListArray<T> subArray = new ListArray<>(toIndex - fromIndex);
        for (int i = 0; i < toIndex - fromIndex; i++) {
            subArray.add(array[fromIndex + i]);
        }
        return subArray;
    }

    @Override
    public boolean add(Object e) {
        try {
            add(size, e);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return true;
    }

}