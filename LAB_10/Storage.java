public class Storage<T> {
    T[] storage;

    public Storage(T[] array) {
        storage = array;
    }

    public T get(int index) {
        return storage[index];
    }
}
