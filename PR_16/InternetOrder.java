import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InternetOrder implements Order {
    private List<Item> orderList;

    public InternetOrder() {
            orderList = new CycleList<>();
    }

    @Override
    public void add(Item item) {
        orderList.add(item);
    }

    @Override
    public void remove(String name) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getName().equals(name)) {
                orderList.remove(orderList.get(i));
                break;
            }
        }
    }

    @Override
    public void removeAll(String name) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getName().equals(name)) {
                orderList.remove(orderList.get(i));
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
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getName().equals(name)) {
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
        int cost = 0;
        for (int i = 0; i < orderList.size(); i++) {
            cost += orderList.get(i).getCost();
        }
        return cost;
    }

    @Override
    public String[] dishesNames() {
        String[] names = new String[orderList.size()];
        int index = 0;
        for (int i = 0; i < orderList.size(); i++) {
            names[index++] = orderList.get(i).getName();
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
