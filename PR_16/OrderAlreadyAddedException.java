public class OrderAlreadyAddedException extends Exception {
    private static final long serialVersionUID = 1L;
    
    public OrderAlreadyAddedException() {
        super("Order already added by this address");
    }
}
