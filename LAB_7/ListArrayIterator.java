import java.util.Iterator;

public class ListArrayIterator<T> implements Iterator {
    private ListArray<T> ar;
    private int currentPos = 0;

    public ListArrayIterator(ListArray<T> ar) {
        this.ar = ar;
    }

    @Override
    public boolean hasNext() {
        boolean res = false;
        // TODO Auto-generated method stub
        try {
            
            res = ar.get(currentPos + 1) != null ? true : false;
            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    @Override
    public Object next() {
        // TODO Auto-generated method stub

        return ar.get(currentPos++);
    }
    
}
