import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList <E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    public WaitList() {
        content = new ConcurrentLinkedQueue<E>();
    }

    public WaitList(Collection<E> c) {
        content = new ConcurrentLinkedQueue<E>(c);
    }

    
    /** 
     * @param element
     */
    @Override
    public void add(E element) {
        content.add(element);
    }

    
    /** 
     * @param element
     * @return boolean
     */
    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    
    /** 
     * @param c
     * @return boolean
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    
    /** 
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    
    /** 
     * @return E
     */
    @Override
    public E remove() {
        return content.remove();
    }

    
    /** 
     * @return String
     */
    public String toString() {
        return content.toString();
    }
}
