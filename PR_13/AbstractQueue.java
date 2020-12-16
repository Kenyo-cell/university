public interface AbstractQueue<T> {
    public void enqueue(T e);

    public T element();

    public T dequeue();
    
    public int size();

    public boolean isEmpty();

    public void clear();
}
