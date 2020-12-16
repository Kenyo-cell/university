public final class Dish implements Item {
    private String name;
    private String description;
    private int cost;

    public Dish(String name, String description) {
        if (name == null || description == null) {
            throw new IllegalArgumentException("Invalid data");
        }
        this.name = name;
        this.description = description;
        this.cost = 0;
    }

    public Dish(String name, String description, int cost) {
        if (name == null || description == null || cost < 0) {
            throw new IllegalArgumentException("Invalid data");
        }
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
