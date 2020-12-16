import java.util.HashMap;
import java.util.Map;

public class TablesOrderManager {
    private Map<Integer, Order> orders;

    public TablesOrderManager() {
        orders = new HashMap<>();
    }

    public void addOrder(int tableNumber, Order order) {
        orders.put(tableNumber, order);
    }

    public void removeOrder(int tableNumber, Order order) {
        orders.remove(tableNumber, order);
    }
}
