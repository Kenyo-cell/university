import java.util.Iterator;

public class ListArrayIterator<T> implements Iterator<T> {
    private ListArray<T> ar;
    private int currentPos = 0;

    public ListArrayIterator(ListArray<T> ar) {
        this.ar = ar;
    }

    @Override
    public boolean hasNext() {
        boolean res = false;
        try {
            res = ar.get(currentPos + 1) != null ? true : false;
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public T next() {
        return ar.get(currentPos++);
    }
    
}
