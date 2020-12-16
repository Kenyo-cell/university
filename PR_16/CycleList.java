import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CycleList<T> implements List<T> {
    private Node<T> firstElement;
    private Node<T> lastElement;
    private int _size;

    public CycleList() {
        firstElement = null;
        _size = 0;
    }

    public CycleList(Collection<T> c) {
        _size = 0;
        for (T el : c) {
            this.add(el);
        }
    }

    @Override
    public int size() {
        return  _size;
    }

    @Override
    public boolean isEmpty() {
        return _size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new CycleIterator<>(this);
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public T[] toArray(Object[] a) {
        return null;
    }

    @Override
    public boolean add(T e) {
        Node<T> nel = new Node<>(e);

        if (isEmpty()) {
            firstElement = nel;
            lastElement = nel;

            firstElement.next = lastElement;
            firstElement.prev = lastElement;
            
            lastElement.next = firstElement;
            lastElement.prev = firstElement;
        }
        
        lastElement.next = nel;

        nel.prev = lastElement;
        nel.next = firstElement;

        lastElement = nel;
        firstElement.prev = lastElement;
        
        _size++;

        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        if (index >= _size) return null;
        Node<T> current = firstElement;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.object;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public T remove(int index) {
        if (index >= _size) return null;
        Node<T> current = firstElement;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;

        if (current.equals(firstElement)) {
            firstElement = current.next;
        } else if (current.equals(lastElement)) {
            lastElement = current.prev;
        }

        _size--;
        return current.object;
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
    
}
