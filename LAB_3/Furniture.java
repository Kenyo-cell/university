public abstract class Furniture {

    public Furniture(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }

    public int getFurnitureTypeId() {
        return furnitureTypeId;
    }

    public void setFurnitureTypeId(int furnitureTypeId) {
        this.furnitureTypeId = furnitureTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FurnitureFactory getFactory() {
        return factory;
    }

    public String toString() {
        return color + " " + description + " by " + cost + " rub";
    }

    private int cost;
    private String color;
    private String description;
    private int furnitureTypeId;
    private FurnitureFactory factory = FurnitureFactory.getFactory();
}
