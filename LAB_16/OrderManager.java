import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OrderManager {
    private Map<String, Order> orders;

    public OrderManager() {
        orders = new HashMap<>();
    }

    public void addOrder(String address, Order order) throws OrderAlreadyAddedException {
        if (orders.get(address) != null) throw new OrderAlreadyAddedException();
        orders.put(address, order);
    }

    public void removeOrder(String address, Order order) {
        orders.remove(address, order);
    }

    public Order getOrder(String address) {
        return orders.get(address);
    }

    public void addToOrder(String address, Item item) {
        Order addictional = orders.get(address);
        addictional.add(item);
    }

    public Order[] getOrders() {
        return orders.values().toArray(new Order[0]);
    }

    public int orderCount() {
        return orders.size();
    }

    public int itemcountInInternetOrders(String name) {
        int count = 0;
        for (Entry<String, Order> order : orders.entrySet()) {
            if (order.getValue() instanceof InternetOrder) {
                String[] names = order.getValue().dishesNames();
                for (String pos : names) {
                    count += pos.equals(name) ? 1 : 0;
                }
            }
        }
        return count;
    }
}
