public class Chair extends Furniture {

    public Chair(String color) {
        super(50, color);
        super.setDescription("Chair");
        super.setFurnitureTypeId(1);
    }
}
