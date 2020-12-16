import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> orderList;

    public Order() {
        orderList = new ArrayList<>();
    }

    public void add(Item item) {
        orderList.add(item);
    }

    public void remove(Item item) {
        orderList.remove(item);
    }
}
