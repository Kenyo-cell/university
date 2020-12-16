class Node<T> {
    public T object;
    public Node<T> next;
    public Node<T> prev;

    public Node() {
        object = null;
        next = null;
        prev = null;
    }

    public Node(T object) {
        this.object = object;
        next = null;
        prev = null;
    }
}
