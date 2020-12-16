import java.util.LinkedList;

public class LinkedQueue<T> {
    private LinkedList<T> _collection = new LinkedList<>();
    private int _size = 0;

    public LinkedQueue(LinkedList<T> collection) {
        _collection = collection;
        _size = collection.size();
    }

    public void enqueue(T e){
        _collection.add(e);
    }

    public T element() {
        _size--;
        return _collection.getFirst();
    }

    public T dequeue() {
        _size--;
        return _collection.removeFirst();
    }

    public int size() {
        return _size;
    }

    public boolean isEmpty() {
        return _size == 0;
    }

    public void clear() {
        _collection = new LinkedList<>();
    }
}
