import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RestrauntOrder implements Order {
    private List<Item> orderList;

    public RestrauntOrder() {
        orderList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        orderList.add(item);
    }

    @Override
    public void remove(String name) {
        for (Item item : orderList) {
            if (item.getName().equals(name)) {
                orderList.remove(item);
                break;
            }
        }
    }

    @Override
    public void removeAll(String name) {
        for (Item item : orderList) {
            if (item.getName().equals(name)) {
                orderList.remove(item);
            }
        }
    }

    @Override
    public int dishQuantity() {
        return orderList.size();
    }

    @Override
    public int dishQuantity(String name) {
        int size = 0;
        for (Item item : orderList) {
            if (item.getName().equals(name)) {
                size++;
            }
        }
        return size;
    }

    @Override
    public Item[] getDishes() {
        return orderList.toArray(new Item[0]);
    }

    @Override
    public double costTotal() {
        double cost = 0;
        for (Item item : orderList) {
            cost += item.getCost();
        }
        return cost;
    }

    @Override
    public String[] dishesNames() {
        String[] names = new String[orderList.size()];
        int index = 0;
        for (Item item : orderList) {
            names[index++] = item.getName();
        }
        return names;
    }

    @Override
    public Item[] sortDishesByCost() {
        Item[] sorted = orderList.toArray(new Item[0]);
        Arrays.sort(sorted, Comparator.comparing(Item::getCost));
        return sorted;
    }
}
