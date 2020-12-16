import java.util.Iterator;

public class CycleIterator<T> implements Iterator<T> {
    private CycleList<T> list;
    private int index = 0;

    public CycleIterator(CycleList<T> list) {
        this.list = list;
    }


    @Override
    public boolean hasNext() {
        if (index == list.size()) return false;
        index++;
        return true;
    }

    @Override
    public T next() {
        return list.get(index);
    }
    
}
