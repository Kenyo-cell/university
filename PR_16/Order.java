public interface Order {
    public void add(Item item);
    public void remove(String name);
    public void removeAll(String name);
    public int dishQuantity();
    public int dishQuantity(String name);
    public Item[] getDishes();
    public double costTotal();
    public String[] dishesNames();
    public Item[] sortDishesByCost();
}
