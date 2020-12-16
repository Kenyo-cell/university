public final class Drink implements Item {
    private String name;
    private String description;
    private int cost;

    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public Drink(String name, String description, int cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
