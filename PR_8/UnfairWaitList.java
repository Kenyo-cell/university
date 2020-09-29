public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList() {
        super();
    }

    
    /** 
     * @param element
     */
    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack() {
        content.add(content.poll());
    }
}
